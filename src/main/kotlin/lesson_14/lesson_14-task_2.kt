package org.example.lesson_14

open class Ship(
    val name: String,
    val maxSpeed: Int = 48, //  км/ч
    val numberOfPassengersAndCrew: Int = 9_000,
    val liftingCapacity: Int = 2_000,
    val isIcebreaker: Boolean = false,
) {
    fun startMoving() = println("Корабль начал движение")

    fun extendHorizontalLadderFromWaist() = println("выдвинуть горизонтальный трап со шкафута;")

    open fun pintProperty() =
        println(
            """
        |Имя корабля: $name
        |Максимальная скорость, км/ч: $maxSpeed
        |Количество экипажа и пассажиров: $numberOfPassengersAndCrew
        |Максимальная грузоподъемность, т: $liftingCapacity
        |Может плавать в северных широтах: $isIcebreaker
            """.trimMargin(),
        )
}

class CargoShip(
    name: String,
    maxSpeed: Int = 35, //  км/ч
    numberOfPassengersAndCrew: Int,
    liftingCapacity: Int,
    val isEnterRiverPorts: Boolean = true,
) : Ship(name, maxSpeed, numberOfPassengersAndCrew, liftingCapacity) {
    fun starDownloading() = println("Началась загрузка контейнеров")

    fun startUnloading() = println("Началась разгрузка контейнеров")

    fun activateLoadingCrane() = println("Активирован погрузочный кран")
}

class Icebreaker(
    name: String,
    isIcebreaker: Boolean = true,
    maxSpeed: Int = 30, //  км/ч
    numberOfPassengersAndCrew: Int,
    liftingCapacity: Int,
    val maxIceThickness: Int = 5, // метров
    val isNuclear: Boolean = false,
) : Ship(name, maxSpeed, numberOfPassengersAndCrew, liftingCapacity, isIcebreaker) {
    fun checkAtomicEngine() = println("Включена проверка силовой установки")

    fun openGateFromAftSide() = println("Открыты ворота со стороны кормы.")

    override fun pintProperty() {
        super.pintProperty()
        println(
            """
            |Максимальная преодолеваемая толщина льда: $maxSpeed"
            |Двигатель атомный: 
            """.trimMargin(),
        )
    }
}

fun main() {
    val liner = Ship("Глория", 40, 5_000, 1_000)
    val cargoShip = CargoShip("Ever Given", 30, 50, 20_000, false)
    val icebreaker = Icebreaker("Ленин", true, 17, 1000, 3_0000, 3, true)

    liner.pintProperty()
    cargoShip.pintProperty()
    icebreaker.pintProperty()
}
