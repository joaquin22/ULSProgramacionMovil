package practica_2.library.interfaces

import practica_2.library.model.Material
import practica_2.library.model.User

interface ILibrary {
    fun addMaterial(material: Material)
    fun addUser(user: User)
    fun lendMaterial(user: User, material: Material)
    fun returnMaterial(user: User, material: Material)
    fun showAvailableMaterials()
    fun showLentMaterialsByUser(user: User)
}