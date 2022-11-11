package org.techtown.kotlinsample

open class Human(val name : String="Anonymous"){

    constructor(name : String, age : Int): this(name){
        println("my name is ${name}, ${age}tears old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is YUMYYYYYY~~~")
    }

   open fun sinAsong(){
        println("lalalala")
    }
}

class Korean :Human(){
    override fun sinAsong(){
        super.sinAsong()
        println("랄랄라")
        println("my name is ${name }")
    }
}

fun main(){
    val  korean = Korean()
    korean.sinAsong()
//    val human = Human(name = "haneul")
//
//    val stranger = Human()
//    human.eatingCake()

    val mom = Human("yory",52)

//    println("this human's name is ${stranger.name}")
}