package com.john1119.hw0303postcase

class Box {
    var count=0
    fun counter(length:Int) {
        if(length<=10){
            count+=1
        }else if(length<=15){
            count+=2
        }
        else if (length>15){
            count+=100
        }
    }
}

fun main() {
    var x = 0
    var y = 0
    var z = 0
    var count=0
    println("length")
    readLine()?.let {
        x = it.toInt()
    }
    println("width")
    readLine()?.let {
        y = it.toInt()
    }
    println("height")
    readLine()?.let {
        z = it.toInt()
    }
//    if(x<=10){
//        count+=1
//    }else if(x<=15){
//        count+=2
//    }else{
//        count+=100
//    }
//
//    if(y<=10){
//        count+=1
//    }else if(y<=15){
//        count+=2
//    }else{
//        count+=100
//    }
//
//    if(z<=10){
//        count+=1
//    }else if(z<=15){
//        count+=2
//    }else{
//        count+=100
//    }
//    Box(x,y,z).counter(x)
//    Box(x,y,z).counter(y)
//    Box(x,y,z).counter(z)
//
//
//    var box=when(count){
//        in 0..3->println("box 1 50dollar")
//        4->println("box 2 60dollar")
//        5->println("box 3 70dollar")
//        else -> println("No box can be used")
//    }

}
