package com.design.pattern.singleton;


/*
* Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
* They are needed for works like updating registry settings, management of pools of resources like Thread pools, connections etc
* Any other class don't create a Singleton object, they just ask for one.
* */
public class SingletonJava {

    /* volatile keyword ensure multiple threads handle the uniqueInstance correctly when it
     * is being initialised to the Singleton Instance */
    private volatile static  SingletonJava uniqueInstance = null;
    private SingletonJava() {}

    // This code isn't thread safe
    public static SingletonJava getInstanceWithThreadSafety() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonJava();
        }
        return uniqueInstance;
    }

    /* This code is thread safe but it is pretty expensive
     * We are synchronizing the block everytime we need the @param uniqueInstance
     * However, we just need to synchronize this just for time uniqueInstance get a value
     * This could slow our program by 100x, it works mostly for non-performance driven use-cases
     */
    public synchronized SingletonJava getUniqueInstanceSynchronized() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonJava();
        }
        return uniqueInstance;
    }

    /*
    * Introducing double-check locking mechanism
    * This way we can avoid the expensiveness of synchronizing function blocks
    */
    public SingletonJava getUniqueInstanceWithTheadSafety() {
        if(uniqueInstance == null) {
            synchronized (SingletonJava.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonJava();
                }
            }
        }
        return uniqueInstance;
    }

}
