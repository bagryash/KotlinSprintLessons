package org.example.lesson_17

class Parcel(
    _id: Int,
    _location: String,
) {
    private val id = _id
    var counter = ZERO_NUMBER
    var location = _location
        get() = field
        set(city) {
            field = city
            counter++
        }
}

fun main() {
    val package1 = Parcel(1, "Екатеринбург")
    package1.location = "Уфа"
    package1.location = "Москва"
    package1.location = "Санкт-Петербург"

    println(package1.counter)

}

const val ZERO_NUMBER = 0
