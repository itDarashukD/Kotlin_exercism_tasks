object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        if (list.isEmpty()) {
            throw NoSuchElementException()
        }

        var midIndex : Int = list.size / 2
        var minEl: Int = list[midIndex ]

        return when {
            minEl < item -> {
                val right = list.subList(midIndex + 1, list.size)
                (midIndex + 1) + search(right, item)
            }

            minEl > item -> {
                val left = list.subList(0, midIndex)
                search(left, item)
            }

            else -> midIndex

        }

    }
}

