package game

import players.Player

fun initPlayers(playersNumber: Int): ArrayList<Player> {
    require(playersNumber in 2..22) {
        "Players can be below or equals to 4"
    }
    var Players = ArrayList<Player>()
    for (i in 1..playersNumber) {
        var name: String
        do {
            println("Insert idiot number $i")
            name = readln()
        } while (name == "")

        val player = Player(name)
        Players.add(player)
    }

    return Players
}