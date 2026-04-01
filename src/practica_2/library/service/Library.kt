package practica_2.library.service

import practica_2.library.interfaces.ILibrary
import practica_2.library.model.Material
import practica_2.library.model.User

class Library : ILibrary {

    // Class Properties
    private val availableMaterials = mutableListOf<Material>()
    private val lentMaterials = mutableMapOf<User, MutableList<Material>>()
    private val users = mutableListOf<User>()


    override fun addMaterial(material: Material) {
        // Implementation to add material to the library
        this.availableMaterials.add(material)
        println("Material '${material.title}' added to the library.")
    }

    override fun addUser(user: User) {
        // Implementation to add user to the library
        this.users.add(user)
        println("User '${user.firstName}' added to the library.")
    }

    override fun lendMaterial(user: User, material: Material) {
        // Implementation to lend material to a user
        if (availableMaterials.contains(material)) {
            availableMaterials.remove(material)
            lentMaterials.getOrPut(user) { mutableListOf() }.add(material)
            println("Material '${material.title}' lent to user '${user.firstName}'.")
        } else {
            println("Material '${material.title}' is not available for lending.")
        }
    }

    override fun returnMaterial(user: User, material: Material) {
        if (lentMaterials[user]!!.contains(material)) {
            lentMaterials[user]!!.remove(material)
            availableMaterials.add(material)
            println("Material '${material.title}' returned by user '${user.firstName}'.")
        } else {
            println("Material '${material.title}' was not lent to user '${user.firstName}'.")
        }
    }

    override fun showAvailableMaterials() {
        availableMaterials.forEach {
            println(it.showDetails())
        }
    }

    override fun showLentMaterialsByUser(user: User) {
        println("Lent Materials for user '${user.firstName}': ")

        lentMaterials[user]?.ifEmpty {
            println("No materials lent to user '${user.firstName}'.")
            return
        }?.forEach {
            println(it.showDetails())
        }

        lentMaterials[user]?.forEach {
            println(it.showDetails())
        } ?: println("No materials lent to user '${user.firstName}'.")
    }
}