package org.example.Lesson_16

class Order(
    private val number: Int,
    private var isOrderReady: Boolean = false,
) {
    private fun setStatusReady(status: Boolean) {
        isOrderReady = status
    }

    fun createRequestToManager(status: Boolean) {
        setStatusReady(status)
    }
}

fun main() {
    val order1 = Order(1)

    order1.createRequestToManager(true)
}
