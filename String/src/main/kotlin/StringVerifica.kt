class StringVerifica(private val string: Array<Char>) {

    fun equalsTo(otherString: String): Boolean {
        if (string.size != otherString.length) return false

        for (i in string.indices) {
            if (string[i] != otherString[i]) return false
        }

        return true
    }

    fun toCharArray(): Array<Char> {
        return string
    }

    fun countVowels(): Int {
        var vowelsNumber = 0
        val vowels = "aeiou".toCharArray()

        for (i in string.indices) {
            if (string[i].lowercase()[0] in vowels) {
                vowelsNumber++
            }
        }

        return vowelsNumber
    }

    fun countOccurrences(char: Char): Int {
        var occurrences = 0
        for (i in string.indices) {
            if (string[i] == char) {
                occurrences++
            }
        }

        return occurrences
    }

    fun capitalizeString() {
        string[0] = (string[0].digitToInt() - 32).toChar()
    }
}
