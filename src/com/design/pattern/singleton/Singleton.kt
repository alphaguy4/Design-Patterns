package com.design.pattern.singleton

/*
* In kotlin we need to simply use `object` keyword to declare a singleton class
* For example: object Singleton
* The object classes can have functions, properties and the init method
* Constructor isn't allowed in object, so we can use `init{}` for some initialisation
* */

object Singleton {

    init {
        println("Hello, I am Singleton class from kotlin")
        println("Unlike java, i don't need boiler plate code")
    }

    fun helperFunction(str: String = "") {
        println("I am a single $str")
    }

    var singletonVariable: String = "Hello Singleton world";
}

fun main() {
    Singleton.helperFunction()
    Singleton.singletonVariable = "Changed"
    Singleton.helperFunction("Kotlin")
}

