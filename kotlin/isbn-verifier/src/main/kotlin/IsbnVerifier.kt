class IsbnVerifier {
//    3-598-21508-8
//    3-598-21507-X
//    (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) mod 11 == 0

    fun isValid(number: String): Boolean {
        val message: List<Int> = parseString(number)
        val sum: Int = calculate(message)

        return sum.mod(11) == 0
    }

    private fun calculate(message: List<Int>): Int {
        return getSum(message)
    }

    private fun parseString(number: String): List<Int> {
        return number.trim()
            .replace("\\-".toRegex(), "")
            .toCharArray()
            .map { if (it == 'X') 10 else it.digitToInt() }
            .toList()
    }

    private fun getSum(message: List<Int>): Int {
        var count = 10;
        var groupBy: Map<Int, List<Int>> =
            message.groupBy(keySelector = { count-- }, valueTransform = { it })
        var sum: Int = groupBy.map { it.key.times(it.value.first()) }.sum()

        return sum
    }

//    fun isValid(number: String): Boolean {
//        val n = number.replace("-", "")
//        if (!Regex("^[0-9]{9}[0-9X]$").matches(n)) return false
//
//        val digits = n.substring(0 ,9).map { it.digitToInt() }
//        val control = n.last().let {
//            if (it == 'X') 10
//            else it.digitToInt()
//        }
//        return (digits.mapIndexed { i, d -> d * (10 - i)}.sum() + control) % 11 == 0
//    }
}