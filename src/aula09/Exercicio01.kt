package aula09

fun main() {
    val exercicio1 = Exercicio1()
    exercicio1.listarLoteria()
    exercicio1.listarApelidos()
}
class Exercicio1(){
    val loteria = mapOf(
            0 to "Ovos",
            1 to "Água",
            2 to "Escopeta",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo"
    )
    val apelidos = mapOf(
            "João" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George")
    )
    fun listarLoteria(){
        /* loteria.forEach {
             println(it)
         }*/
        for((key, value) in loteria){
            println(key)
            println(value)
        }
    }
    fun listarApelidos(){
        apelidos.forEach { key, value ->
            println(key)
            value.forEach {
                println("- $it")
            }
        }
    }
}