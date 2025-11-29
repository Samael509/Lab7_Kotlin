import artifact.*

fun main() {
    val sword = Weapon("магический меч", 50, "epic", "огонь", false)
    val potion = Potion("Зелье силы", 30, "rare", 60, true)
    val relic = Relic("древний амулет", 20, "common", "эльфийское", 3)

    val items: List<MagicItem> = listOf(sword, potion, relic)

    for (item in items) {
        item.describe()
        println(item.use())
        println()
    }
}