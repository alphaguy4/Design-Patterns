package com.design.pattern.strategy

class MuteQuack: QuackBehaviour {
    override fun quack() {
        println("Silence !!")
    }
}