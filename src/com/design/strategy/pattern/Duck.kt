package com.design.strategy.pattern

abstract class Duck() {
    lateinit var quackBehaviour: QuackBehaviour
    lateinit var flyBehaviour: FlyBehaviour
    abstract fun display()

    fun swim() {
        println("All ducks can swim, even decoys!!")
    }

    fun performFly() {
        flyBehaviour.fly()
    }

    fun performQuack() {
        quackBehaviour.quack()
    }

}