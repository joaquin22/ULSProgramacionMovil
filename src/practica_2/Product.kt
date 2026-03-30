package practica_2

class Product(price: Double, discount: Double) {
    var price: Double = 0.0
        set(value) {
            field = value
            require(value >= 0) { "El precio debe ser mayor a 0." }
        }

    // Descuento con validación en el setter (0% a 100%)
    var discount: Double = 0.0
        set(value) {
            field = value
            require(value in 0.0 ..100.0) { "El descuento debe estar entre 0 y 100" }
        }

    init {
        this.price = price
        this.discount = discount
    }

    fun finalPrice(): Double {
        return price * (1 - discount/100)
    }

    override fun toString(): String {
        return """
            Precio original : S/%.1f
            Descuento       :  %.1f%%
            Precio final    : S/%.2f
        """.trimIndent().format(price, discount, finalPrice())
    }
}

fun main (){
    val product: Product = Product(10.0,50.0)
    println(product)
}