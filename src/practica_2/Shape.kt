package practica_2

import kotlin.math.pow

abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side.pow(2.0)
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius.pow(2.0)
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val square: Square = Square(5.0)
    println("Cuadrado: Area = ${square.area()}, Perimetro = ${square.perimeter()}")

    val rectangle: Rectangle = Rectangle(4.0, 6.0)
    println("Rectangulo: Area = ${rectangle.area()}, Perimetro = ${rectangle.perimeter()}")

    val circle: Circle = Circle(3.0)
    println("Circulo: Area = ${circle.area()}, Perimetro = ${circle.perimeter()}")
}