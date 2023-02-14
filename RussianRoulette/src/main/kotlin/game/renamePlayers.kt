package game

import players.Player

fun initPlayers(playersNumber: Int) {
    require(playersNumber <= 4) {
        "Players can be below or equals to 4"
    }
    lateinit var Players: ArrayList<String>()
    for (i in 1..playersNumber) {
        var name: String
        do {
            name = readln()
        } while (name == "")

        val player = Player(name)

    }
}