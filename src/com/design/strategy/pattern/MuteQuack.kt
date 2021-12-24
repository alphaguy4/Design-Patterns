package com.design.strategy.pattern

class MuteQuack: QuackBehaviour {
    override fun quack() {
        println("Silence !!")
    }
}