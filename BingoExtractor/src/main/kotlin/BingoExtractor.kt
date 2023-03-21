class BingoExtractor {

    private val numbers = Array<Boolean>(90) {true}


    fun isEmpty(): Boolean {
        var empty = false
        for (i in numbers.indices) {
            empty = numbers[i] == false
        }
        return empty
    }

    fun extractNumber() {
        var randomNumber: Int
        if (!isEmpty()) {
            do {
                randomNumber = (0..89).random()
            } while (!numbers[randomNumber])
            numbers[randomNumber] = false
        }
    }
}