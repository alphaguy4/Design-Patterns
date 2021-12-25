package com.design.observer.pattern

class CurrentConditionDisplay(val weatherData:  Subject): Observer, DisplayElement {
    private var temperature: Float = 100.0F
    private var humidity: Float = 56.4F

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("""
            Temperature: $temperature,
            Humidity: $humidity
        """.trimIndent())
    }
}