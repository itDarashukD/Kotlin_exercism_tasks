object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
      return  source.flatMap {element->
            when{
                element is Collection<*> -> flatten(element)
                else -> listOf(element)
            }
        }.filterNotNull()

    }

}

