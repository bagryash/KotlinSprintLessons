package org.example.lesson_19

enum class Gender(
    gender: String,
) {
    MAN("M"),
    WOMAN("W"),
}

fun getGender(id: String): Gender =
    if (id == "M") {
        Gender.MAN
    } else {
        Gender.WOMAN
    }

class Person(
    val name: String,
    val gender: Gender,
)

fun main() {
    var fileCabinet = listOf<Person>()
    var counter = FIVE_NEW

    println(
        """
            Добро пожаловать в \"Картотеку\"!
        Здесь можно создавать и хранить данные о человеке - его имя и пол. 
        Данные вводятся:
        Имя - кириллицей или латиницей
        Пол - M(мужской) или W(женский) только латиницей
        
        """.trimIndent(),
    )

    while (counter != 0) {
        println("Введите по очереди данные человека:")
        val person = Person(name = readln(), gender = getGender(readln()))
        fileCabinet += person
        counter--
    }

    fileCabinet.forEach {
        println(it.name + ", " + it.gender)
    }
}

const val FIVE_NEW = 5
