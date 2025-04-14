package org.example.lesson_15

abstract class Product(
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
) : Product(name, quantity, price, manufacturer),
    Instrument {
    override fun searchAccessories() = println("Выполняется поиск аксессуаров")
}

class AdditionalProduct(
    name: String,
    quantity: Int,
    price: Int,
    manufacturer: String,
    val instrument: MusicalInstrument,
    val isOriginal: Boolean,
) : Product(name, quantity, price, manufacturer)

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
        AdditionalProduct(
            "Струны для электрогитары Fender",
            100,
            900,
            "США",
            fenderStratocaster,
            true,
        )

    val fenderStringsChina =
        AdditionalProduct(
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
