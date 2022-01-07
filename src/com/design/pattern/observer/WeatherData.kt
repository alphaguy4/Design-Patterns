package com.design.pattern.observer

class WeatherData : Subject {
    private var observers: ArrayList<Observer> = ArrayList()
    private var temperature: Float = 100.0F
    private var humidity: Float = 0.0F
    private var pressure: Float = 0.0F

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementChanged() {
        notifyObserver()
    }

    fun setMeasurement(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }

    // other methods below here
}