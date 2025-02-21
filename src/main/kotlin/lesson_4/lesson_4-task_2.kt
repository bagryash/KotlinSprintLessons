package org.example.lesson_4

fun main() {

    var cargoWight = 20
    var cargoVolume = 80

    println(
        "Груз с весом $cargoWight кг и объемом $cargoVolume л соответствует категории 'Average': " +
                ((AVERAGE_CARGO_WIGHT_MIN < cargoWight) and (cargoWight <= AVERAGE_CARGO_WIGHT_MAX) and (cargoVolume < AVERAGE_CARGO_VOLUME_MAX))
    )
    cargoWight = 50
    cargoVolume = 100

    println(
        "Груз с весом $cargoWight кг и объемом $cargoVolume л соответствует категории 'Average': " +
                ((AVERAGE_CARGO_WIGHT_MIN < cargoWight) and (cargoWight <= AVERAGE_CARGO_WIGHT_MAX) and (cargoVolume < AVERAGE_CARGO_VOLUME_MAX))
    )

}

const val AVERAGE_CARGO_WIGHT_MIN = 35
const val AVERAGE_CARGO_WIGHT_MAX = 100
const val AVERAGE_CARGO_VOLUME_MAX = 100

