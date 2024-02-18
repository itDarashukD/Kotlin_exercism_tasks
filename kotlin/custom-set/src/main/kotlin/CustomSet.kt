class CustomSet(vararg elements: Int) {

    var set = elements.toMutableSet()

    fun isEmpty(): Boolean {
        return set.isEmpty()
    }

    fun isSubset(other: CustomSet): Boolean {
//      return  other.set.all { set.contains(it) }
//        return set.containsAll(other.set)
         return set.all { other.set.contains(it) }
    }

    fun isDisjoint(other: CustomSet): Boolean {
     return set.all { !other.set.contains(it) }
    }

    fun contains(other: Int): Boolean {
        return set.contains(other)
    }

    fun intersection(other: CustomSet): CustomSet {
//        var toIntArray = set.intersect(other.set).toIntArray()
//        return CustomSet(*toIntArray)

        return set.filter { other.set.contains(it) }.toIntArray().let { CustomSet(*it) }
    }

    fun add(other: Int) {

        set.add(other)
    }

    override fun equals(other: Any?): Boolean {
        var customSet = other as CustomSet

      return  set.size==customSet.set.size && isSubset(customSet)
    }

    operator fun plus(other: CustomSet): CustomSet {
        var intArray = set.plus(other.set).distinct().toIntArray()

        return CustomSet(*intArray)
    }

    operator fun minus(other: CustomSet): CustomSet {
        var minus = set.minus(other.set).distinct().toIntArray()
       return CustomSet(*minus)
    }
}
