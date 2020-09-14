package exIngresso

abstract class IngressoVIP (valorIngresso: Float, adicionalVIP: Float):Ingresso (valorIngresso){
    init {
        this.valorIngresso +=adicionalVIP
    }
}// end of class IngressoVIP