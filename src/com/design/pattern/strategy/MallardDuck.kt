package com.design.pattern.strategy

class MallardDuck() : Duck() {

    init {
        quackBehaviour = Quack()
        flyBehaviour = FlyWithWings()
    }

    override fun display() {
        println("I am a read Mallard Duck !!")
    }
}