package com.design.pattern.strategy

class FlyRocketPowered: FlyBehaviour {
    override fun fly() {
        println("I am flying like a rocket. Zooshh!!")
    }
}