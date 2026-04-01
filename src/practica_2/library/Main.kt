package practica_2.library

import practica_2.library.model.Book
import practica_2.library.model.Journal
import practica_2.library.model.User
import practica_2.library.service.Library

fun main() {
    val book1 = Book(
        title = "The Lord of the Rings",
        author = "J.R.R. Tolkien",
        publicationYear = "1954",
        genere = "Fantasy",
        numberPages = 1178
    )
    val book2 = Book(
        title = "One Hundred Years of Solitude",
        author = "Gabriel García Márquez",
        publicationYear = "1967",
        genere = "Magical Realism",
        numberPages = 471
    )

    val journal1 = Journal(
        title = "Science",
        author = "Various authors",
        publicationYear = "2024",
        issn = "0036-8075",
        volume = "383",
        number = "12",
        publisher = "AAAS",
    )

    val journal2 = Journal(
        title = "National Geographic",
        author = "Various authors",
        publicationYear = "2023",
        issn = "0036-1236",
        volume = "78",
        number = "5",
        publisher = "National Geographic Society",
    )

    val library = Library()

    library.addMaterial(book1)
    library.addMaterial(book2)
    library.addMaterial(journal1)
    library.addMaterial(journal2)


    val user1 = User("Anna", "Garcia", "30")
    val user2 = User("Charles", "Lopez", "25")

    library.addUser(user1)
    library.addUser(user2)

    library.lendMaterial(user1, book1)
    library.lendMaterial(user2, journal1)

    library.showAvailableMaterials()

    library.returnMaterial(user1, book1)

    library.showAvailableMaterials()
    library.showLentMaterialsByUser(user1)

}