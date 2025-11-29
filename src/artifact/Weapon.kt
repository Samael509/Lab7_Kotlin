package artifact

class Weapon(
    name: String,
    power: Int,
    rarity: String,
    val damageType: String, // огонь, лед, тьма ...
    val isTwoHanded: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        super.describe()
        println("тип урона: $damageType, требует две руки: $isTwoHanded")
    }

    override fun use(): String {
        return "наносит $damageType урон силой $power"
    }
}