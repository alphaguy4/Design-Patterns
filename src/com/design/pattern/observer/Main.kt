package com.design.pattern.observer
fun main(args: Array<String>) {
    val weatherData = WeatherData()

    // Implement a display and add as an observer
    val display = CurrentConditionDisplay(weatherData)
    display.display()

    weatherData.setMeasurement(12.0F, 10.5F, 112.98F)
    weatherData.setMeasurement(22.0F, 75.5F, 98.98F)
    weatherData.setMeasurement(34.0F, 66.5F, 100.98F)
}