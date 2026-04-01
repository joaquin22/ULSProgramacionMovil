package practica_2.library.model

class Book(
    title: String,
    author: String,
    publicationYear: String,
    val genere: String,
    val numberPages: Int,
) : Material(
    title, author, publicationYear
) {
    override fun showDetails() {
        println("=== LIBRO ===")
        println("Título:           $title")
        println("Autor:            $author")
        println("Año publicación:  $publicationYear")
        println("Género:           $genere")
        println("Número de páginas:$numberPages")
    }
}
