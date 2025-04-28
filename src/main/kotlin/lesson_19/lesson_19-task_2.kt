package org.example.lesson_19

enum class Category {
    CLOTHES {
        override fun getCategory(): String = "Одежда"
    },
    OFFICE_SUPPLIES {
        override fun getCategory(): String = "Канцелярские товары"
    },
    DIFFERENT {
        override fun getCategory(): String = "Разное"
    }, ;

    abstract fun getCategory(): String
}

class Product(
    val id: Int,
    val name: String,
    private val category: Category,
) {
    fun printInfo() = println("Товар: $name, артикул: $id, категория: ${category.getCategory()}")
}

fun main() {
    val product1 = Product(1, "Футболка черная", Category.CLOTHES)
    val product2 = Product(2, "Степлер", Category.OFFICE_SUPPLIES)
    val product3 = Product(3, "Наушники проводные", Category.DIFFERENT)

    val listOfProduct = listOf(product1, product2, product3)

    for (i in listOfProduct) i.printInfo()
}
