# Strategy Pattern

If defines a family of algorithms and encapsulate each one and make them interchangeable.
Strategy lets algorithm vary independently from the clients that uses it.

## Notes on applying strategy pattern

* Identify the aspects of your application that varies and separate them from what stays the same.
* Take the parts that vary and encapsulate them, so that later you can extend or alter the part that vary without affecting those who don't
* Program to an Interface/Super type, not an implementation


## Favour composition over inheritance (HAS-A relationship)
* It helps change behaviour at runtime
* Encapsulate a family of algorithms
* Has-A relationship 
