package com.john1119.hw0303postcase

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.john1119.hw0303postcase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun alert(message:String){
        AlertDialog.Builder(this)
                .setTitle("result")
                .setMessage(message)
                .setPositiveButton("OK",null)
                .show()

    }
    fun calculate(view:View){
        var x = binding.edX.text.toString().toInt()
        var y = binding.edY.text.toString().toInt()
        var z = binding.edZ.text.toString().toInt()
        println("$x,$y,")
        var box = Box()
        box.counter(x)
        box.counter(y)
        box.counter(z)
        var count=box.count
        when(count){
            in 0..3->alert("box1 50dollar")
            4->alert("box2 60dollar")
            5->alert("box3 70dollar")
            else->alert("There is no box can be used")
        }
        binding.edX.setText("")
        binding.edY.setText("")
        binding.edZ.setText("")
    }

}