package practica_2.library.model

abstract class Material(
    val title: String,
    val author: String,
    val publicationYear: String
) {

    abstract fun showDetails()

}