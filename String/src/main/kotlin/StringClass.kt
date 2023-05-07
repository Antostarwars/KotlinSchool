class StringClass(private val string: Array<Char>) {


    fun equalsTo(otherString: String): Boolean {
        if (string.size != otherString.length) return false

        for (i in string.indices) {
            if (string[i] != otherString[i]) return false
        }

        return true
    }

    fun trim(): Array<Char> {
        var positionFirst = -1
        var lastPosition = -1

        for(i in string.indices){
            if(string[i] != ' '){
                positionFirst = i
                break
            }
        }
        for(i in string.size-1 downTo 0){
            if(string[i] != ' '){
                lastPosition = i
                break
            }
        }

        if(positionFirst == -1 && lastPosition == -1){
            return Array(0){' '}
        }

        val array = Array<Char>(lastPosition - positionFirst + 1){' '}
        for(i in positionFirst..lastPosition){
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