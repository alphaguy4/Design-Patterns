package com.design.strategy.pattern

/*
* Design Principle 1: Identify aspects of the application that varies and separate them from the constants.
* For example: Here fly and quack varies from duck to duck. Hence, we created interfaces for both,
* and implemented different classes with different implementations.
* We can add even more and this won't affect the constant part of code
*
*
* Design Principle 2: Program to an interface, not an implementation. Benefit from the use of polymorphism.
* Example, for modelDuck below we can benefit from changing the fly behaviour at runtime and
* it can be entirely new fly behaviour all together like Rocket type below. We benefit from polymorphism here
* "Program to an interface" really means "program to a supertype"
*
* Design Principle 3: Favor composition over inheritance.
* Example, Instead of inheriting their behaviours like quack, fly they are being composed with right behavior object.
* Composition gives more flexibility by
* 1. Letting you encapsulate the algorithms by keeping them in separate classes.
* 2. Lets you change the behaviour at runtime as well
*
* Chapter1: Strategy Pattern
* SP defines a family of algorithms(quacks, fly's), encapsulate each one and makes them interchangeable.
* Strategy let the algorithm vary independently from the client that uses it.
* */

fun main(args: Array<String>) {
    // Polymorphism
    val mallardDuck: Duck = MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()

    // Changing the duck's behaviour at run time
    val modelDuck: Duck = ModelDuck()
    modelDuck.performFly()
    modelDuck.flyBehaviour = FlyRocketPowered()
    modelDuck.performFly()

    // Duck call
    val duckCall: Quack = Quack()
    duckCall.quack()
}
