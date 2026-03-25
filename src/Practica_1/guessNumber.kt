package Practica_1
import kotlin.random.Random

fun GuessNumber(){
    val numberToGuess = Random.nextInt(1, 31)
    var attempts = 0
    val attemptsLimit = 5
    var guessedCorrectly = false

    println("¡Bienvenido al juego de adivinar el número!")
    println("Estoy pensando en un número entre 1 y 30. ¿Puedes adivinarlo?")

    while (!guessedCorrectly) {
        print("Ingresa tu suposición: ")
        val userGuess = readLine()!!.toInt()
        attempts++
        when {
            attempts == attemptsLimit -> {
                println("Game Over")
                println("El número correcto era: $numberToGuess")
                break
            }
            userGuess < numberToGuess -> println("Demasiado bajo. Intenta de nuevo.")
            userGuess > numberToGuess -> println("Demasiado alto. Intenta de nuevo.")
            else -> {
                guessedCorrectly = true
                println("¡Felicidades! Adivinaste el número $numberToGuess en $attempts intentos.")
            }
        }
    }
}

fun main(){
 GuessNumber()
}