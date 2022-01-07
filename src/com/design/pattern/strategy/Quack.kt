package com.design.pattern.strategy

open class Quack: QuackBehaviour {
    override fun quack() {
        println("Quack !! Quack !!")
    }
}