package com.ruslanb.model

import java.math.BigDecimal
import java.util.Date

data class Vehicle(
    val brand: String,
    val model: String,
    val manufacturer: String,
    val manufactureDate: Date,
    val maxSpeed: Double,
    val price: BigDecimal,
    val isABS: Boolean,
    val battery: Battery
): Comparable<Vehicle> {
    override fun compareTo(other: Vehicle): Int {
        val equal = this.model == other.model && this.manufactureDate == other.manufactureDate
        return if (equal) 0 else 1
    }
}
