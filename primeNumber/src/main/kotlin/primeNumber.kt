fun primeNumber(number: Int): Boolean {
    require(number > 0) {
        "Number must be positive"
    }

    for (i in 0 until number) {

        if (number % i == 0) {
            return true
        }

    }
    return false
}