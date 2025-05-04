package org.example.lesson_18

class Order(
    private val id: Int,
) {
    fun printOrderInfo(product: String) = println("Заказан товар: $product")

    fun printOrderInfo(products: List<String>) = println("Заказаны следующие товары: $products")
}

fun main() {
    val order1 = Order(1)
    order1.printOrderInfo("Майка черная")

    val order2 = Order(2)
    order2.printOrderInfo(listOf("Кеды черные", "Кеды черные высокие", "Шорты черные", "Очки солнцезащитные"))
}
