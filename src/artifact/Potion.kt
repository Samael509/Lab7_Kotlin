package artifact

class Potion(
    name: String,
    power: Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("длительность эффекта: $effectDuration секунд")
    }

    override fun use(): String {
        return if (isConsumable) {
            "использовано зелье $name. эффект действует $effectDuration секунд."
        } else {
            "зелье $name многоразовое. можно использовать снова."
        }
    }
}