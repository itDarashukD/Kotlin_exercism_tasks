class CustomSet2(vararg elements: Int) {

    class CustomSet(vararg elements: Int) {

        private val items = elements.toMutableList()

        fun isEmpty(): Boolean = items.isEmpty()


        fun isSubset(other: CustomSet): Boolean
        = items.all { other.items.contains(it) }


        fun isDisjoint(other: CustomSet): Boolean
        = items.all { !other.items.contains(it) }


        fun contains(other: Int): Boolean = items.contains(other)

        fun intersection(other: CustomSet): CustomSet =
            other.items.filter { contains(it) }.toIntArray().let { CustomSet(*it) }

        fun add(other: Int) {
            if (!items.contains(other)) {
                items.add(other)
            }
        }

        override fun equals(other: Any?): Boolean =
            other is CustomSet && other.items.size == items.size && isSubset(other)


        operator fun plus(other: CustomSet): CustomSet =
            (items + other.items).distinct().toIntArray().let { CustomSet(*it) }

        operator fun minus(other: CustomSet): CustomSet =
            items.filter { !other.items.contains(it) }.toIntArray().let { CustomSet(*it) }
    }
}
