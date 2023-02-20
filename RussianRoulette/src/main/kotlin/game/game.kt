package game

import players.Player
import kotlin.random.Random

fun game(players: ArrayList<Player>) {

    var chamber = Random.nextInt(1,7)
    var turn = 0
    while(players.size > 1){
        turn %= players.size
        println(chamber)
        if(chamber == 1){
            println("${players[turn].name} died of excessive Amogussy")
            removeSanity(players, turn)
            turn = (turn+players.size)%players.size
            players.removeAt(turn)
            chamber = Random.nextInt(1,6)

        }else{
            println("${players[turn].name} didn't kill himself.")
            players[turn].sanity--


            if(players[turn].sanity <= 3){
                if(players[turn].sanity <= 1){
                    var inp = Random.nextInt(1,3)
                    if(inp == 1){
                        println("${players[turn].name} shot again out of insanity!")
                        chamber--
                        if(chamber == 1){
                            println("${players[turn].name} died of excessive Amogussy")
                            removeSanity(players, turn)
                            chamber = Random.nextInt(1,7)
                        }else{
                            println("But ${players[turn].name} didn't kill himself")
                        }
                    }else{
                        println("Shoot again to get sanity? (1 to shoot)")
                        var inp = readln().toIntOrNull() ?: 0
                        if (inp == 1) {
                            chamber--
                            players[turn].sanity++
                            if (chamber == 1) {
                                println("$turn Amogussy")
                                removeSanity(players, turn)
                                chamber = Random.nextInt(1, 7)
                            } else {
                                println("${players[turn].name} didn't kill himself")
                            }
                        }
                    }
                }
            }
        }
        readln()
        turn++
    }

    println("The winner is ${players[0].name}")
}

fun removeSanity(players: ArrayList<Player>, turn: Int){
    players[(turn+players.size-1)%players.size].sanity--
    players[(turn+1)%players.size].sanity--
    players.forEach {
        it.sanity--
    }
}
