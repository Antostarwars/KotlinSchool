package players

import kotlin.random.Random

class Player (val name: String) {
    init {
        require(name != "") {
            "Name can't be empty"
        }
    }
    lateinit var list: ArrayList<Int>
    private var id = Random.nextInt(100000,1000001)

    fun addId() {
        while (id in list) {
            id = Random.nextInt(100000,1000000)
        }
        list.add(id)
    }

    var sanity = 6

}