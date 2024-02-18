class PhoneNumber(given: String) {

    var number: String = filterNumber(given)
    init {
        require(number[0] !in "01") //if false - throw exception
        require(number[3] !in "01")
        require(number.length == 10)
    }
    private fun filterNumber(given: String) = given.filter { it.isDigit() }.removePrefix("1")
}