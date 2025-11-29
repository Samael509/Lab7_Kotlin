import transport.*

fun main() {
    // задание 1
    val transports: List<Transport> = listOf(
        Horse("конь", 40, 1),
        Dragon("красный дракон", 80, 2),
        Boat("весельная лодка", 20, 4),
        Teleport("магический телепорт", 0, 1)
    )

    for (transport in transports) {
        transport.describe()
        transport.move()
        transport.specialAbility()
        println()
    }
}