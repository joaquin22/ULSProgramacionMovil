package Practica_1
import kotlin.random.Random

fun guessNumber(){
    val numberToGuess: Int = Random.nextInt(1, 31)
    var attempts: Int = 0
    val attemptsLimit: Int = 5
    var guessedCorrectly: Boolean = false

    println("¡Bienvenido al juego de adivinar el número!")
    println("Estoy pensando en un número entre 1 y 30. ¿Puedes adivinarlo?")

    while (!guessedCorrectly) {
        print("Ingresa tu suposición: ")
        val userGuess: Int = readLine()!!.toInt()
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
    guessNumber()
}