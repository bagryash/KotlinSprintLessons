package org.example.lesson_1

class PassengerCar(
    name: String,
    type: String,
    override val numberOfSeatsMax: Int = NUMBER_OF_PASSENGERS_MAX,
) : Moveable,
    PassengerTransportable

class Track(
    name: String,
    type: String,
    override val weightMax: Int = CARGO_WEIGHT_MAX,
) : Moveable,
    CargoTransportable

interface Moveable {
    fun move(direction: String) = println("Машина едет в пункт $direction")
}

interface PassengerTransportable {
    val numberOfSeatsMax: Int

    fun loading(
        number: Int,
        numberOfOccupiedSeats: Int,
    ): Int {
        val passengers = number - numberOfOccupiedSeats
        if (number <= numberOfSeatsMax && (passengers > 0)) println("В машину сели $number пассажира")
        return passengers
    }

    fun transportPassengers(
        number: Int,
        direction: String,
    ) = println("Машина везет $number пассажиров в пункт $direction")

    fun discharge(passengers: Int): Int {
        println("Из машины вышли $passengers пассажира")
        return passengers
    }
}

interface CargoTransportable {
    val weightMax: Int

    fun loadingCargo(
        number: Int,
        weightNow: Int,
    ): Int {
        val weight = number - weightNow
        if (number <= weightMax && (weight > 0)) println("В грузовик загрузили ${weight}кг груза")
        return weight
    }

    fun transportCargo(
        weight: Int,
        direction: String,
    ): Int {
        println("Грузовика везет ${weight}кг груза в пункт $direction")
        return weight
    }

    fun unloadCargo(weight: Int): Int {
        println("Грузовика разгрузил ${weight}кг груза")
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
    while (passengersInB < NUMBER_OF_PASSENGERS) {
        audi.move("A")
        val passengers = audi.loading(3, audiPassengersNow)
        audi.transportPassengers(passengers, "B")
        passengersInB += audi.discharge(passengers)
    }

    println("\nПеревозка груза:")
    while (cargoinB < CARGO_WEIGHT) {
        gasel.move("A")
        val cargoWight = gasel.loadingCargo(CARGO_WEIGHT, gaselCargoNow)
        gasel.transportCargo(cargoWight, "B")
        cargoinB += gasel.unloadCargo(cargoWight)
    }

    println("\nПеревезено $passengersInB пассажиров и ${cargoinB}кг груза")
}

const val NUMBER_OF_PASSENGERS = 6
const val CARGO_WEIGHT = 2000
const val NUMBER_OF_PASSENGERS_MAX = 3
const val CARGO_WEIGHT_MAX = 2000
