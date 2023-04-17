class Stack(private val length: Int) {
    var stack = Array(length){0}
        private set
    private var stackPointer = 0

    init {
        require(length >= 0) {"Stack Length is lesser than 0!"}
    }

    fun isEmpty() = stackPointer == 0

    fun push(value: Int) {
        check(stackPointer < length) {"StackOverflow (StackPointer: $stackPointer, Length: $length)!"}
        stack[stackPointer] = value
        stackPointer++
    }

    fun pop(): Int {
        check(stackPointer > 0) {"Stack cannot be Empty!"}
        stackPointer--
        return stack[stackPointer]
    }
}