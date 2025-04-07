package org.example.lesson_15

interface Flying {
    fun startTakeoff()

    fun developMaximumSpeed()

    fun startLanding()
}

interface Floating {
    fun startDiving()

    fun startAscent()

    fun moveInStraightLine()
}

class CrucianCarp : Floating {
    override fun startDiving() {
        println("Поплыл вниз")
    }

    override fun startAscent() {
        println("Поплыл к поверхности воды глотнуть воздуха")
    }

    override fun moveInStraightLine() {
        println("Поплыл по прямой")
    }
}

class Seagull :
    Floating,
    Flying {
    override fun startDiving() {
        println("Задержал дыхание и поплыл вниз")
    }

    override fun startAscent() {
        println("Поймал рыбу и поплыл вверх")
    }

    override fun moveInStraightLine() {
        println("Поплыл прямо по поверхности воды")
    }

    override fun startTakeoff() {
        println("Расправил крылья и начал взлетать")
    }

    override fun developMaximumSpeed() {
        println("Машет крыльями изо всех сил")
    }

    override fun startLanding() {
        println("Снизился, расправил крылья и плюхнулся пузом на воду, сложил крылья")
    }
}

class Duck :
    Floating,
    Flying {
    override fun startDiving() {
        println("Задержал дыхание и поплыл вниз")
    }

    override fun startAscent() {
        println("Погрыз водоросли и поплыл вверх")
    }

    override fun moveInStraightLine() {
        println("Поплыл прямо по поверхности воды")
    }

    override fun startTakeoff() {
        println("Расправил крылья и начал взлетать")
    }

    override fun developMaximumSpeed() {
        println("Машет крыльями изо всех сил")
    }

    override fun startLanding() {
        println("Снизился, затормозил пятками об воду, плюхнулся пузом на воду и сложил крылья")
    }
}

fun main() {
    val crucianCarp = CrucianCarp()
    println(CrucianCarp::class.simpleName + ": ")
    crucianCarp.startAscent()
    crucianCarp.startDiving()
    crucianCarp.moveInStraightLine()

    val seagull = Seagull()
    println(Seagull::class.simpleName + ": ")
    seagull.startDiving()
    seagull.startLanding()
    seagull.moveInStraightLine()
    seagull.startTakeoff()
    seagull.developMaximumSpeed()
    seagull.startLanding()

    val duck = Duck()
    println(Duck::class.simpleName + ": ")
    duck.startDiving()
    duck.startLanding()
    duck.moveInStraightLine()
    duck.startTakeoff()
    duck.developMaximumSpeed()
    duck.startLanding()
}
