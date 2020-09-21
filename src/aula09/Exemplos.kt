package aula09

fun main() {

    val listaNaoMutavel = listOf("cesar", true, 1, 1.0, 1.0f, "a")

    val listaMutavel = mutableListOf("cesar", true, 1, 1.0, 1.0f, "a")
    listaMutavel.add(2)
    listaMutavel.add(3)
    listaMutavel.add("String")

    val listaDeStringsNaoMutavel = listOf("Cesar", "Eduardo", "Mariana", "Patricia")
    val listaDouble = listOf<Double>(2.0, 1.0, 10.0, 11.0)

    val listaStringMutavel = mutableListOf<Any>("Cesar", "Eduardo", "Mariana", "Patricia")
    listaStringMutavel.add(2.0)
    listaStringMutavel.add(true)

    val animal = Animal()

    listaStringMutavel.add(animal)

    val teste: MutableList<Double> = mutableListOf(2.0, 1.0)

    val conjuntoSet = setOf(1, "Cesar", "Eduardo", "Cesar", 2, 3)
    val conjuntoSetMutavel = mutableSetOf(1, "Cesar", "Eduardo", "Cesar", 2, 3)

    conjuntoSetMutavel.add(1)
    conjuntoSetMutavel.add(10)
    conjuntoSetMutavel.add("Cesar")
    conjuntoSetMutavel.addAll(conjuntoSet)
    //println(conjuntoSetMutavel)
    conjuntoSetMutavel.size

    val mapaDeValoresNaoMutavel = mapOf("Chave" to "Cesar", 2 to "Eduardo", 3 to true)
    val mapaDeValoresMutavel = mutableMapOf("Chave" to "Cesar", 2 to "Eduardo", 3 to true)

    mapaDeValoresMutavel.set("1", "Mariana")
    mapaDeValoresMutavel[1] = "Jonathas"

    //println(mapaDeValoresMutavel[1])
    //println(mapaDeValoresMutavel.get("Cesar"))
    mapaDeValoresMutavel.set(2 to 4, "Cesar")
    mapaDeValoresMutavel[5..10] = "Cesar"

    //println(mapaDeValoresMutavel)

    mapaDeValoresMutavel[6] = "Alexandre"

    //println(mapaDeValoresMutavel.get(Pair(2, 4)))

    //println(mapaDeValoresMutavel)

    //println(mapaDeValoresMutavel[6])

    mapaDeValoresMutavel.forEach {
        //println(it)
    }

    val cliente = Cliente()
    val caixa = mutableMapOf("023812930" to cliente)
    caixa["023812930"]
    //                0  1  2  3
    val list = listOf(1, 1, 1, 2, 2, 3, 1, 3, 1)
    println(list.indexOfFirst { it % 2 == 0 && it != 2 })
    println(list.indexOf(2))
}

class Cliente()

class Animal()
