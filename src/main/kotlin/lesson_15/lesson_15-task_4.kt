package org.example.lesson_15

abstract class Products(
    val name: String,
    val quantity: Int,
    val price: Int,
    val manufacturer: String,
) {
    fun searchAnalogue() = println("Выполняется поиск аналога")
}

interface Instrument {
    fun searchAccessories()
}

class MusicalInstrument(
    name: String,
    quantity: Int,
    price: Int,
    manufacturer: String,
    val category: String,
    val yearOfRelease: Int,
) : Products(name, quantity, price, manufacturer),
    Instrument {
    override fun searchAccessories() = println("Выполняется поиск аксессуаров")
}

class Accessories(
    name: String,
    quantity: Int,
    price: Int,
    manufacturer: String,
    val instrument: MusicalInstrument,
    val isOriginal: Boolean,
) : Products(name, quantity, price, manufacturer)

fun main() {
    val fenderStratocaster =
        MusicalInstrument(
            "Fender Stratocaster",
            10,
            129700,
            "Электрогитары",
            "Энсенада (Мексика)",
            20024,
        )

    val fenderStrings =
        Accessories(
            "Струны для электрогитары Fender",
            100,
            900,
            "США",
            fenderStratocaster,
            true,
        )

    val fenderStringsChina =
        Accessories(
            "Струны для электрогитары Fender",
            100,
            900,
            "Китай",
            fenderStratocaster,
            true,
        )

    fenderStratocaster.searchAnalogue()
    fenderStratocaster.searchAccessories()

    fenderStrings.searchAnalogue()
}
