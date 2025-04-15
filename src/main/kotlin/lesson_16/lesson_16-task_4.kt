package org.example.Lesson_16

class Order(
    val number: Int,
    private var isOrderReady: Boolean = false,
) {
    fun setStatusReady(status: Boolean) {
        isOrderReady = status
    }
}

fun createRequestToManager(
    order: Order,
    status: Boolean,
) {
    order.setStatusReady(status)
}

fun main() {
    val order1 = Order(1)

    createRequestToManager(order1, true)
}
