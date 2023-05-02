class Matrix (private val length: Int, private val height: Int) {
    private val matrix: Array<Int>
    init {
        require(length > 0) { "Length must be greater than 0" }
        require(height > 0) { "Height must be greater than 0" }

        matrix = Array<Int>(length * height) {0}
    }

    fun get(column: Int, row: Int) {
        require(column < height) { "Column cannot be be lower than height ($height)" }
        require(row < length) { "Row cannot be lower than length ($length)" }

        matrix[row * height + column]
    }

    fun set(column: Int, row: Int, value: Int) {
        require(column < height) { "Column cannot be be lower than height ($height)" }
        require(row < length) { "Row cannot be lower than length ($length)" }

        matrix[row * height + column] = value
    }


}