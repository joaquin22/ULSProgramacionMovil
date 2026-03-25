package Practica_1

import kotlin.random.Random

enum class Choices(val choice: String) {
    PIEDRA("Piedra"),
    PAPEL("Papel"),
    TIJERAS("Tijeras")
}

fun readUserChoice(): Choices{
    while (true){
        println("Seleccione una opción:")
        println("1: Piedra")
        println("2: Papel")
        println("3: Tijeras")

        when (readLine()!!.toInt()) {
            1 -> return Choices.PIEDRA
            2 -> return Choices.PAPEL
            3 -> return Choices.TIJERAS
            else -> println("Opción inválida, por favor intente de nuevo.")
        }

    }
}

fun determineWinner(userChoice: Choices, computerChoice: Choices): String {
    if (userChoice == computerChoice) {
        return "Empate"
    }
    return when (userChoice) {
        Choices.PIEDRA -> if (computerChoice == Choices.TIJERAS) "¡Ganaste!" else "¡Perdiste!"
        Choices.PAPEL -> if (computerChoice == Choices.PIEDRA) "¡Ganaste!" else "¡Perdiste!"
        Choices.TIJERAS -> if (computerChoice == Choices.PAPEL) "¡Ganaste!" else "¡Perdiste!"
    }
}

fun RockPapperScissors(){
    println("Bienvenido al juego de Piedra, Papel o Tijeras!")
    val userChoice = readUserChoice()
    val computerChoice = Choices.entries[Random.nextInt(Choices.entries.size)]
    val result = determineWinner(userChoice, computerChoice)
    println("Tú elegiste: ${userChoice.choice}")
    println("La computadora eligió: ${computerChoice.choice}")
    println("Resultado: $result")
}

fun main() {
    RockPapperScissors()
}