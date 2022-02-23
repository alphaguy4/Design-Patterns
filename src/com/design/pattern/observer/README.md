# Observer Pattern

The Observer pattern describes one to many dependency between objects so that when one object changes its state, all of its dependents are notified and updated automatically

## Some Notes about Observer Pattern
* Think of Observer pattern like a newspaper subscription service
* Observer pattern provides Object design where the Subject and Observer are loosely coupled
* It has two main components
* Subject/Observable - The object which needs to be observed
* Observer - The object when are observing the Subject/Observable
* There are multiple ways to implement Observer pattern, Subject/Observable and Observer interfaces are the most popular ones.
* All Observers implement a common interface so that subject/observables knows where to send them.
* `java.util.Observables`, `java,util.Observer` violates this design rule as these are concert classes instead of interfaces.
* Major drawback in above case is classes that already extends different class can use java Observable classes.

## Design Principles
* Identify the aspect of your application that vary and separate them from what stays the same.
* Strive for loosely coupled design between objects that interact.
* Program to an interface not an implementation.
* Encapsulate what varies.
* Favor composition over inheritance.


