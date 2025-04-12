package org.example.lesson_1

class PassengerCar(
    name: String,
    type: String,
) : Moveable,
    PassengerTransportable

class Track(
    name: String,
    type: String,
) : Moveable,
    CargoTransportable

interface Moveable {
    fun move(direction: String) = println("Машина едет в пункт $direction")
}

interface PassengerTransportable {
    fun loading(
        number: Int,
        passengersNow: Int,
    ): Int {
        val passengers = number - passengersNow
        if (number <= NUMBER_OF_PASSENGERS_MAX && (passengers > 0)) println("В машину сели $number пассажира")
        return passengers
    }

    fun transportPassengers(
        number: Int,
        direction: String,
    ) = println("Машина везет $number пассажиров в пункт $direction")

    fun discharge(number: Int): Int {
        val passengers = number
        println("Из машины вышли $passengers пассажира")
        return passengers
    }
}

interface CargoTransportable {
    fun loadingCargo(
        number: Int,
        weightNow: Int,
    ): Int {
        val weight = number - weightNow
        if (number <= CARGO_WEIGHT_MAX && (weight > 0)) println("В грузовик загрузили ${weight}кг груза")
        return weight
    }

    fun transportCargo(
        number: Int,
        direction: String,
    ): Int {
        val weight = number
        println("Грузовика везет ${number}кг груза в пункт $direction")
        return weight
    }

    fun unloadCargo(number: Int): Int {
        val weight = number
        println("Грузовика разгрузил ${number}кг груза")
        return weight
    }
}

fun main() {
    val audi = PassengerCar("audi 80", "Легковой")
    val gasel = Track("Газель", "Грузовая")
    var audiPassengersNow = 0
    var gaselCargoNow = 0

    var passengersInB = 0
    var cargoinB = 0

    println("Перевозка пассажиров:")
    while (passengersInB < NUMBER_OF_PASSENGERS_) {
        audi.move("A")
        val passengers = audi.loading(3, audiPassengersNow)
        audi.transportPassengers(passengers, "B")
        passengersInB += audi.discharge(passengers)
    }

    println("\nПеревозка груза:")
    while (cargoinB < CARGO_WEIGHT_MAX) {
        gasel.move("A")
        val cargoWight = gasel.loadingCargo(CARGO_WEIGHT, gaselCargoNow)
        gasel.transportCargo(cargoWight, "B")
        cargoinB += gasel.unloadCargo(cargoWight)
    }

    println("\nПеревезено $passengersInB пассажиров и ${cargoinB}кг груза")
}

const val NUMBER_OF_PASSENGERS_ = 6
const val CARGO_WEIGHT = 2000
const val NUMBER_OF_PASSENGERS_MAX = 3
const val CARGO_WEIGHT_MAX = 2000
