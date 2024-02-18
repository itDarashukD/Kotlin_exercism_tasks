class Dna(private val string: String) {
//    ```
//    "GATTACA" -> 'A': 3, 'C': 1, 'G': 1, 'T': 2
//    "INVALID" -> error
//    ```
init {
    require(string.all { it in "ACGT" }) { "Invalid nucleotide in: $string" }
}
    val nucleotideCounts = ("ACGT" + string).groupBy { it }.mapValues { it.value.size.dec() }


//    val nucleotideCounts: Map<Char, Int>
//        get() {
//            return   string
//                .groupingBy { it }.eachCount()
//        }
}
