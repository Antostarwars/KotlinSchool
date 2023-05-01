class StringClass(private val stringValue: Array<Char>) {

    val string = stringValue

    fun equalsTo(otherString: String): Boolean {
        if (string.size != otherString.length) return false

        for (i in string.indices) {
            if (string[i] != otherString[i]) return false
        }

        return true
    }

    fun trim(): Array<Char> {
        var positionFirst = 0
        var positionSecond = 0

        for(i in string.indices){
            if(string[i] != ' '){
                positionFirst = i
                break
            }
        }
        for(i in string.size-1 downTo 0){
            if(string[i] != ' '){
                positionSecond = i
                break
            }
        }

        val array = Array<Char>(positionSecond - positionFirst + 1){' '}
        for(i in positionFirst..positionSecond){
            array[i-positionFirst] = string[i]
        }
        return array
    }
    fun toInt(): Int {
        for (i in string.indices) {
            check(string[i] in '0'..'9') {
                "You cannot convert characters that are not numbers"
            }
        }

        var result = 0
        var multiplier = 1

        for (i in string.size -1 downTo 0) {
            val digit = string[i] - '0'

            result += digit * multiplier
            multiplier *= 10
        }
        return result
    }
}