class Point(var x: Double, var y: Double) {
    fun isOnOrigin() = x == 0.0 && y == 0.0
    fun isOnAxisX() = x == 0.0
    fun isOnAxisY() = y == 0.0
}