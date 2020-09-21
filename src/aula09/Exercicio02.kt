package aula09

fun main() {
    val apelidos = mapOf(
            "João" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George")
    )
    apelidos.forEach {
        println(it)
    }
}