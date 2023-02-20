import game.game
import game.initPlayers

fun main(){
    println("How many idiots are gonna die tonight? (max 4)")
    var p = readln().toIntOrNull() ?: 2
    val players = initPlayers(p)

    game(players)
}