package com.design.strategy.pattern

class NoFly: FlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}