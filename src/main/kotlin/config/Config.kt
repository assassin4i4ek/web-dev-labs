package com.ruslanb.config

import com.ruslanb.dao.BatteryContainer
import com.ruslanb.dao.BatteryContainerImpl
import com.ruslanb.dao.VehicleContainer
import com.ruslanb.dao.VehicleContainerImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.Calendar
import java.util.GregorianCalendar

@Configuration
open class Config {
    @Bean
    open fun vehicleContainer(): VehicleContainer = VehicleContainerImpl()

    @Bean
    open fun batteryContainer(): BatteryContainer = BatteryContainerImpl()

    @Bean
    open fun calendar(): Calendar = GregorianCalendar()
}