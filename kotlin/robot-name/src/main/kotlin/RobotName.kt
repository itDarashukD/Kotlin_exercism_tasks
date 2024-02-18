import kotlin.random.Random

class Robot {
    var name = getName()
    fun reset() {
        name.let {
            name = getName()
            usedNames.remove(it)
        }
    }

    companion object {
        val usedNames = mutableSetOf<String>()

        private fun getName() = generateSequence { getRandomName() }
            .filter { it !in usedNames }
            .first()
            .also { usedNames.add(it) }

        private fun getRandomName(): String {
            var sb = StringBuilder()
            for (i in 1..2) {
                var chars = 'A'..'Z'
                var randomChar = chars.random()

                sb.append(randomChar)
            }
            var randomInt = Random.nextInt(100, 999)
            sb.append(randomInt.toString())
            return sb.toString()
        }
    }
}
