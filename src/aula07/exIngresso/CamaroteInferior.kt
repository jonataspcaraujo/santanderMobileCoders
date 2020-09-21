package aula07.exIngresso

class CamaroteInferior(valorIngresso: Float, adicionalVIP: Float, var localizacao: String):
    IngressoVIP(valorIngresso,adicionalVIP){
    init{
        this.categoriaIngresso = "Camarote Inferior"
    }
    fun imprimeLocalizacao(){
        println("Localização do Ingresso: $localizacao")
    }
}//end of classe CamaroteInferior