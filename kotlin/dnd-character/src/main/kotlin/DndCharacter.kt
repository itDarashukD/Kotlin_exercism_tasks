import kotlin.math.floor
import kotlin.random.Random

class DndCharacter {

    var constitution = ability()
    val strength: Int =  ability()
    val dexterity: Int =  ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int =ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            var sortedList = mutableListOf<Int>();
            for (i in 1..4) {
                var nextInt = Random.nextInt(1, 7)
                sortedList.add(nextInt)
            }
            sortedList.sort()
            return sortedList.drop(1).sum()
        }

        fun modifier(constitution: Int): Int {
            var i = constitution - 10
            var x :Double = i.div(2.toDouble())
            var toInt = floor(x).toInt()
            return toInt


        }
    }

}
