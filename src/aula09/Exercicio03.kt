package aula09

class Prova() {
    fun somaTota(conjuntoDeInteiros: Set<Int>){
        println(conjuntoDeInteiros.sum())
    }
}
fun main() {
    val cjt = setOf(1,5,5,6,7,8,8,8)
    var prova1 = Prova()
    prova1.somaTota(cjt)
}