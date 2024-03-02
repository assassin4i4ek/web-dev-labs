package lab1.model

import java.util.Date

data class Battery(
    val model: String,
    val manufacturer: String,
    val type: String,
    val capacity: Int,
    val manufactureDate: Date,
    val chargeTime: Double,
    val isFastCharge: Boolean
): Comparable<Battery> {
    override fun compareTo(other: Battery): Int {
        val equal = this.model == other.model && this.capacity == other.capacity
        return if (equal) 0 else 1
    }
}
