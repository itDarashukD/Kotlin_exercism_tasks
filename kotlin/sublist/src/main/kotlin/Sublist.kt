enum class Relationship {

    EQUAL, SUBLIST, SUPERLIST, UNEQUAL

}

fun <T> List<T>.relationshipTo( list2: List<T>): Relationship {
    return when {
        this == list2 -> Relationship.EQUAL

        this.isSublistOf(list2) -> Relationship.SUBLIST
        list2.isSublistOf(this) -> Relationship.SUPERLIST

        else -> {
            Relationship.UNEQUAL
        }
    }

}

private fun <T> List<T>.isSublistOf(list2: List<T>): Boolean {
   return this.isEmpty() || this in list2.windowed(this.size)
}
