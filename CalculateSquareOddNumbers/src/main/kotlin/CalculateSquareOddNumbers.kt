import kotlin.math.abs

fun squareOf(number: Int): Int {
    val absoluteNumber = abs(number)

    var sum = 0
    for (oddNumber in 1..absoluteNumber*2 step 2) {
        sum += oddNumber
    }

    return sum
}