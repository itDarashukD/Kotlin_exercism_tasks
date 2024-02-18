object Acronym {


    fun generate(phrase: String): String {
        return phrase.splitWords()
            .map {it.first()}
            .joinToString("")
            .toUpperCase()
    }

    fun String.splitWords(): List<String> {
        return this.split("[\\s-_]+".toRegex())
    }

}
