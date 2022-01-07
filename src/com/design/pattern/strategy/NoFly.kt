package com.design.pattern.strategy

class NoFly: FlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}