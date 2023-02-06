fun primeNumber(number: Int): Boolean {
    require(number > 1) {
        "Number must be positive"
    }

    for (i in 2 until number) {

        if (number % i == 0) {
            return false
        }

    }
    return true
}