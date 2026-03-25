package Practica_1

fun calculator(){
    println("====Menu====")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. Division")
    println("5. Salir")

    val operation: Int = readLine()!!.toInt()

    if (operation in 1..4){
        println("Ingrese el primer número:")
        val num1: Double = readLine()!!.toDouble()
        println("Ingrese el segundo número:")
        val num2: Double = readLine()!!.toDouble()

        val result = when (operation) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
            else -> "Opción inválida"
        }
        println("Resultado: $result")
    } else if (operation == 5) {
        println("Saliendo del programa...")
    } else {
        println("Opción inválida, por favor intente de nuevo.")
    }
}

fun main(){
    calculator()
}