package org.example.lesson_4

fun main() {

    val averageLoadWeightMin = 36
    val averageLoadWeightMax = 100
    val averageLoadVolumeMax = 100

    val cargoWightOne = 20
    val cargoVolumeOne = 80
    val cargoWightTow = 50
    val cargoVolumeTow = 100

    println(
        "Груз с весом $cargoWightOne кг и объемом $cargoVolumeOne л соответствует категории 'Average': " +
                ((averageLoadWeightMin <= cargoWightOne) and (cargoWightOne < averageLoadWeightMax) and (cargoVolumeOne < averageLoadVolumeMax))
    )

    println(
        "Груз с весом $cargoWightTow кг и объемом $cargoVolumeTow л соответствует категории 'Average': " +
                ((averageLoadWeightMin <= cargoWightTow) and (cargoWightTow < averageLoadWeightMax) and (cargoVolumeTow < averageLoadVolumeMax))
    )

}

