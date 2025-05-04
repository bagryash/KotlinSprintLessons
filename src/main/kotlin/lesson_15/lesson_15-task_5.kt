package org.example.lesson_15

class PassengerCar(
    name: String,
    type: String,
    override val numberOfSeatsMax: Int = NUMBER_OF_PASSENGERS_MAX,
    var passengersNow: Int = 0,
) : Moveable,
    PassengerTransportable

class Track(
    name: String,
    type: String,
    override val weightMax: Int = CARGO_WEIGHT_MAX,
    var cargoNow: Int = 0,
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
        println("Грузовик везет ${weight}кг груза в пункт $direction")
        return weight
    }

    fun unloadCargo(weight: Int): Int {
        println("Грузовик разгрузил ${weight}кг груза")
        return weight
    }
}

fun main() {
    val numberOfPassengers = 6
    val cargoWight = 2000

    val audi = PassengerCar("audi 80", "Легковой")
    val gasel = Track("Газель", "Грузовая")

    var passengersInPointA = numberOfPassengers
    var cargoInPointA = cargoWight

    var passengersInPointB = 0
    var cargoInPointB = 0

    println("Перевозка пассажиров:")
    while (passengersInPointB < numberOfPassengers) {
        audi.move("A")
        val passengers =
            if (passengersInPointA >= NUMBER_OF_PASSENGERS_MAX) {
                audi.loading(
                    NUMBER_OF_PASSENGERS_MAX,
                    audi.passengersNow,
                )
            } else {
                audi.loading(passengersInPointA, audi.passengersNow)
            }
        audi.passengersNow = passengers
        audi.transportPassengers(passengers, "B")
        audi.discharge(passengers)
        audi.passengersNow -= passengers
        passengersInPointB += passengers
        passengersInPointA -= passengers
    }

    println("\nПеревозка груза:")
    while (cargoInPointB < cargoWight) {
        gasel.move("A")
        val cargoWight =
            if (cargoInPointA >= CARGO_WEIGHT_MAX) {
                gasel.loadingCargo(CARGO_WEIGHT_MAX, gasel.cargoNow)
            } else {
                gasel.loadingCargo(cargoInPointA, gasel.cargoNow)
            }
        gasel.cargoNow = cargoWight
        gasel.transportCargo(cargoWight, "B")
        gasel.unloadCargo(cargoWight)
        gasel.cargoNow -= cargoWight
        cargoInPointB += cargoWight
        cargoInPointA -= cargoWight
    }

    println("\nПеревезено $passengersInPointB пассажиров и ${cargoInPointB}кг груза")
}

const val NUMBER_OF_PASSENGERS_MAX = 3
const val CARGO_WEIGHT_MAX = 2000
