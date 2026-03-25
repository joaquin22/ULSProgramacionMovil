package practica_1

fun employEvaluation(){
    println("Ingrese el salario mensual del empleado:")
    val salary: Double = readln().toDouble()
    println("Ingrese la puntuación del empleado (0-10):")
    val score: Int = readln().toInt()

    val performance: String = when(score){
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación inválida"
    }
    val newSalary: Double = salary * (score/10.0)

    println("Evaluación del desempeño: $performance")
    println("Nuevo salario mensual: $newSalary")
}

fun main() {
    employEvaluation()
}