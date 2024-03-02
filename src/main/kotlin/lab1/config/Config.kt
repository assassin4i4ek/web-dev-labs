package lab1.config

import lab1.container.BatteryContainer
import lab1.container.BatteryContainerImpl
import lab1.container.VehicleContainer
import lab1.container.VehicleContainerImpl
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