class IntClass(private val numbers: Array<Int>) {

    var sus = emptyArray<Int>()
        private set

    init {
        require(numbers.isNotEmpty()) { "There's no numbers!" }
    }

    fun equalsTo(otherNumbers: Array<Int>): Boolean {
        if (numbers.size != otherNumbers.size) return false

        for (i in numbers.indices) {
            if (numbers[i] != otherNumbers[i]) return false
            break
        }

        return true
    }

    fun contains(number: Int): Boolean {
        for (i in numbers.indices) {
            if (numbers[i] == number) return true
        }

        return false
    }

    fun getSum(): Int {
        var sum = 0

        for (i in numbers.indices) {
            sum += numbers[i]
        }

        return sum
    }

    fun getAverage(): Int {
        val sum = getSum()

        return sum/numbers.size
    }
}