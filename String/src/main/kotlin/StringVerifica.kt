class StringVerifica(private val string: Array<Char>) {

    fun equalsTo(otherString: StringVerifica): Boolean {
        if (string.size != otherString.string.size) return false

        for (i in string.indices) {
            if (string[i] != otherString.string[i]) {
                return false
            }
        }

        return true
    }

    fun toCharArray(): Array<Char> {
       val newArray = Array<Char>(string.size) {' '}
        for (i in string.indices) {
            newArray[i] = string[i]
        }
        return newArray
    }

    fun replaceChar(charToReplace: Char, charReplaced: Char): StringVerifica {
        val newArray = Array<Char>(string.size) {' '}
        for (i in string.indices) {
          if (string[i] == charToReplace) {
              newArray[i] = charReplaced
          } else {
              newArray[i] = string[i]
          }
        }

        return StringVerifica(newArray)
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
