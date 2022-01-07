package com.design.pattern.observer

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}