package artifact

open class MagicItem(
    val name: String,
    val power: Int,
    val rarity: String // Common, Rare, Epic
) {
    open fun describe() {
        println("артефакт: $name, сила: $power, редкость: $rarity")
    }

    open fun use(): String {
        return "использование $name не определено."
    }
}