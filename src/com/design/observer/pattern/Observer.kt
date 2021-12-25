package com.design.observer.pattern

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}