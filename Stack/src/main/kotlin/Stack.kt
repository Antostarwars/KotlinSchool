class Stack(private val length: Int, private val stackArray: Array<Int>) {
    var stack = stackArray
        private set

    init {
        require(length >= 0) {"Stack Length is lesser than 0"}
        require(stack.size <= length) {"Stack is greater than the length!"}
    }

    private var stackPointer = 0

    fun isEmpty() = stackPointer == 0

    private fun isFull() = stackPointer <= length

    fun push(value: Int) {
        check(isFull()) {"Stack is full"}
        stackPointer += 1
        stack[stackPointer] = value
    }

    fun pop() {
        check(isEmpty()) {"Stack is empty"}
        stackPointer += 1
        stack = stack.copyOfRange(0, stackPointer-1)
    }
}