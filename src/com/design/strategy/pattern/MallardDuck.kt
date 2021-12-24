package com.design.strategy.pattern

class MallardDuck() : Duck() {

    init {
        quackBehaviour = Quack()
        flyBehaviour = FlyWithWings()
    }

    override fun display() {
        println("I am a read Mallard Duck !!")
    }
}