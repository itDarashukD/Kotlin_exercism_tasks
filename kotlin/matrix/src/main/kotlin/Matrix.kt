class Matrix(private var matrixAsString: String) {


    fun rows() : List<List<Int>>{
    return  matrixAsString.trim()
            .lines()
          .map { string -> string.split("\\s+".toRegex()) }
          .map { strings -> strings
              .map { digitString -> digitString.toInt() } }
    }

    fun column(colNr: Int): List<Int> {
        var map = rows().map {
            var i = it[colNr - 1]
            i
        }
        return map
    }

    fun row(rowNr: Int): List<Int> {
        return rows()[rowNr - 1]
    }


    /*   fun column(colNr: Int): List<Int> {
        return matrixAsString.split("\n").map { it.split(" ")[colNr-1].toInt() }
    }
    fun row(rowNr: Int): List<Int> {
        return matrixAsString.split("\n")[rowNr-1].split(" ").map { it.toInt() }
    }*/


}

