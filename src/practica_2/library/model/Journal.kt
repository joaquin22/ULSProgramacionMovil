package practica_2.library.model

class Journal(
    title: String,
    author: String,
    publicationYear: String,
    val issn: String,
    val volume: String,
    val number: String,
    val publisher: String,
) : Material(
    title, author, publicationYear
) {
    override fun showDetails() {
        println("=== REVISTA ===")
        println("Título:           $title")
        println("Autor:            $author")
        println("Año publicación:  $publicationYear")
        println("ISSN:             $issn")
        println("Volumen:          $volume")
        println("Number:           $number")
        println("Publisher:        $publisher")
    }
}