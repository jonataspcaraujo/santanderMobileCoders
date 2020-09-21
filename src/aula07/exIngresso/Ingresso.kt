package aula07.exIngresso

abstract class Ingresso (var valorIngresso: Float){
    var categoriaIngresso: String = ""

    open fun imprimeValorIngresso(){
        println("Ingresso $categoriaIngresso: R$ ${valorIngresso}")
    }
}//end of class Ingresso