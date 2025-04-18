package org.example.lesson_14

open class Ship(
    val name: String,
    val maxSpeed: Int = 48,
    val numberOfPassengersAndCrew: Int = 9_000,
    val liftingCapacity: Int = 2_000,
    val isIcebreaker: Boolean = false,
) {
    fun startMoving() = println("Корабль начал движение")

    fun extendHorizontalLadderFromWaist() = println("Выдвинут горизонтальный трап со шкафута")

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

class CargoShipNew(
    name: String,
    maxSpeed: Int = 35,
    numberOfPassengersAndCrew: Int,
    liftingCapacity: Int,
    val isEnterRiverPorts: Boolean = true,
) : Ship(name, maxSpeed, numberOfPassengersAndCrew, liftingCapacity) {
    fun starDownloading() = println("Началась загрузка контейнеров")

    fun startUnloading() = println("Началась разгрузка контейнеров")

    fun activateLoadingCrane() = println("Активирован погрузочный кран")
}

class IcebreakerNew(
    name: String,
    isIcebreaker: Boolean = true,
    maxSpeed: Int = 30,
    numberOfPassengersAndCrew: Int,
    liftingCapacity: Int,
    val maxIceThickness: Int = 5,
    val isNuclear: Boolean = false,
) : Ship(name, maxSpeed, numberOfPassengersAndCrew, liftingCapacity, isIcebreaker) {
    fun checkAtomicEngine() = println("Включена проверка силовой установки")

    fun openGateFromAftSide() = println("Открыты ворота со стороны кормы.")

    override fun pintProperty() {
        super.pintProperty()
        println(
            """
            |Максимальная толщина льда, м: $maxIceThickness"
            |Двигатель атомный: $isNuclear
            """.trimMargin(),
        )
    }
}

fun main() {
    val liner = Ship("Глория", 40, 5_000, 1_000)
    val cargoShip = CargoShipNew("Ever Given", 30, 50, 20_000, false)
    val icebreaker = IcebreakerNew("Ленин", true, 17, 1000, 3_0000, 3, true)

    liner.pintProperty()
    cargoShip.pintProperty()
    icebreaker.pintProperty()
}
