package org.example.lesson_1

fun main() {

    val numberOfInterns = 30
    val internSalary = 20000.00

    val totalSalary = NUMBER_OF_EMPLOYEES * EMPLOYEES_SALARIES
    val totalSalaryWithInterns = totalSalary + (numberOfInterns * internSalary)
    val averageTotalSalary = totalSalaryWithInterns / (NUMBER_OF_EMPLOYEES + numberOfInterns)

    println(totalSalary.toInt())
    println(totalSalaryWithInterns.toInt())
    println(averageTotalSalary.toInt())

}

const val NUMBER_OF_EMPLOYEES = 50
const val EMPLOYEES_SALARIES = 30000.00
