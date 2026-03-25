package practica_1

import kotlin.random.Random

enum class Choices(val choice: String) {
    PIEDRA("Piedra"),
    PAPEL("Papel"),
    TIJERAS("Tijeras")
}

/**
 * Solicita al usuario una opción del menú y devuelve la elección correspondiente.
 * Si se ingresa un número fuera de ese rango, vuelve a solicitar la opción.
 *
 * @return La opción elegida por el usuario como [Choices].
 */
fun readUserChoice(): Choices{
    while (true){
        println("Seleccione una opción:")
        println("1: Piedra")
        println("2: Papel")
        println("3: Tijeras")

        when (readln().toInt()) {
            1 -> return Choices.PIEDRA
            2 -> return Choices.PAPEL
            3 -> return Choices.TIJERAS
            else -> println("Opción inválida, por favor intente de nuevo.")
        }

    }
}

/**
 * Determina el resultado de la ronda comparando la elección del usuario y la computadora.
 *
 * @param userChoice Elección realizada por el usuario.
 * @param computerChoice Elección generada para la computadora.
 * @return `"Empate"` si ambas elecciones son iguales, `"¡Ganaste!"` si el usuario vence,
 * o `"¡Perdiste!"` si la computadora vence.
 */
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

fun rockPapperScissors(){
    println("Bienvenido al juego de Piedra, Papel o Tijeras!")
    val userChoice: Choices = readUserChoice()
    val computerChoice: Choices = Choices.entries[Random.nextInt(Choices.entries.size)]
    val result: String = determineWinner(userChoice, computerChoice)
    println("Tú elegiste: ${userChoice.choice}")
    println("La computadora eligió: ${computerChoice.choice}")
    println("Resultado: $result")
}

fun main() {
    rockPapperScissors()
}