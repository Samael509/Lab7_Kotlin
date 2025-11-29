package artifact

class Relic(
    name: String,
    power: Int,
    rarity: String,
    val origin: String, // эльфийское, демоническое ...
    var charges: Int
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("происхождение: $origin, заряды: $charges")
    }

    override fun use(): String {
        return if (charges > 0) {
            charges -= 1
            "$name использована. осталось зарядов: $charges"
        } else {
            "$name не имеет зарядов."
        }
    }
}