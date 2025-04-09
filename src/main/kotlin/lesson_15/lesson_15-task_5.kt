package org.example.lesson_1

abstract class Car(
    val name: String,
    val type: String,
) {
    fun runToA() = println("Машина $name едет в пункт А")

    fun runToB() = println("Машина $name едет в пункт В")
}

class PassengerCar(
    name: String,
    type: String,
) : Car(name, type),
    PassengerTransportation

class Track(
    name: String,
    type: String,
) : Car(name, type),
    CargoTransportation

interface PassengerTransportation {
    fun loading(number: Int) = println("В машину сели $number пассажира")

    fun discharge(number: Int) = println("Из машины вышли $number пассажира")
}

interface CargoTransportation {
    fun loadingPassengers() = println("В грузовик сел 1 пассажир")

    fun dischargePassenger() = println("Из грузовика вышел 1 пассажир")

    fun loadingCargo() = println("В грузовик загрузили 2т груза")

    fun dischargePCargo() = println("В грузовика выгрузили 2т груза")
}

fun main() {
    val audi = PassengerCar("audi 80", "Легковой")
    val gasel = Track("Газель", "Грузовая")
    audi.runToA()
    gasel.runToA()
    audi.loading(3)
    gasel.loadingPassengers()
    gasel.loadingCargo()
    audi.runToB()
    gasel.runToB()
    audi.discharge(3)
    gasel.dischargePassenger()
    gasel.dischargePCargo()
    println()
    audi.runToA()
    audi.loading(2)
    audi.runToB()
    audi.discharge(2)
}
