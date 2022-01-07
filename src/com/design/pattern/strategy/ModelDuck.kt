package com.design.pattern.strategy

class ModelDuck: Duck() {

    init {
        flyBehaviour = NoFly()
        quackBehaviour = Quack()
    }

    override fun display() {
        println("I am a model duck !!")
    }
}