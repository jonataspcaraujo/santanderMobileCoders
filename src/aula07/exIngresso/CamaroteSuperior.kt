package aula07.exIngresso

class CamaroteSuperior (valorIngresso: Float,adicionalVIP: Float, valorSuperior: Float):
    IngressoVIP(valorIngresso, adicionalVIP){
    init {
        this.valorIngresso += valorSuperior
        this.categoriaIngresso ="Camarote Superior"
    }
} // end of class Camarote Superior