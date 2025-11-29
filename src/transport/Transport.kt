package transport

open class Transport(
    val name: String,
    val speed: Int,
    val capacity: Int
) {
    open fun describe() {
        println("транспорт: $name, скорость: $speed, вместимость: $capacity")
    }

    open fun move() {
        println("транспорт движется.")
    }

    open fun specialAbility() {
        println("способность недоступна.")
    }
}

class Horse(name: String, speed: Int, capacity: Int) : Transport(name, speed, capacity) {
    override fun describe() {
        println("лошадь: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name скачет")
    }

    override fun specialAbility() {
        println("$name может ускориться в бою")
    }
}

class Dragon(name: String, speed: Int, capacity: Int) : Transport(name, speed, capacity) {
    override fun describe() {
        println("дракон: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name летит высоко над землёй")
    }

    override fun specialAbility() {
        println("$name дышит огнём и перевозит героя по воздуху")
    }
}

class Boat(name: String, speed: Int, capacity: Int) : Transport(name, speed, capacity) {
    override fun describe() {
        println("лодка: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name плывёт по воде")
    }

    override fun specialAbility() {
        println("$name может перевозить группу по рекам и озёрам")
    }
}

class Teleport(name: String, speed: Int, capacity: Int) : Transport(name, speed, capacity) {
    override fun describe() {
        println("телепорт: $name, скорость: $speed, вместимость: $capacity")
    }

    override fun move() {
        println("$name перемещается в другое место")
    }

    override fun specialAbility() {
        println("$name нужна мана для активации, мгновенное перемещение")
    }
}