package exIngresso

fun main(){
    println("Teste")
    val INGRESSO_PADRAO = 60.00f
    val ADCIONAL_VIP = 40.00f
    val CAMAROTE_SUP = 100.00f

    val ingresso1 = IngressoNormal(INGRESSO_PADRAO)
    ingresso1.imprimeValorIngresso()
    val ingresso2 = CamaroteInferior(INGRESSO_PADRAO, ADCIONAL_VIP, "Setor A - Mesa 4B")
    ingresso2.imprimeValorIngresso()
    ingresso2.imprimeLocalizacao()
    val ingresso3 = CamaroteSuperior(INGRESSO_PADRAO, ADCIONAL_VIP, CAMAROTE_SUP)
    ingresso3.imprimeValorIngresso()
}// end of main
abstract class Ingresso (var valorIngresso: Float){
    var categoriaIngresso: String = ""

    open fun imprimeValorIngresso(){
        println("Ingresso $categoriaIngresso: R$ ${valorIngresso}")
    }
}//end of class Ingresso
class IngressoNormal(valorIngresso: Float):Ingresso(valorIngresso){
    init {
        this.categoriaIngresso = "Padrão"
    }
} // end of class IngressoNormal
abstract class IngressoVIP (valorIngresso: Float, adicionalVIP: Float):Ingresso (valorIngresso){
    init {
        this.valorIngresso +=adicionalVIP
    }
}// end of class IngressoVIP
class CamaroteInferior(valorIngresso: Float, adicionalVIP: Float, var localizacao: String):
    IngressoVIP(valorIngresso,adicionalVIP){
    init{
        this.categoriaIngresso = "Camarote Inferior"
    }
    fun imprimeLocalizacao(){
        println("Localização do Ingresso: $localizacao")
    }
}//end of classe CamaroteInferior
class CamaroteSuperior (valorIngresso: Float,adicionalVIP: Float, valorSuperior: Float):
        IngressoVIP(valorIngresso, adicionalVIP){
    init {
        this.valorIngresso += valorSuperior
        this.categoriaIngresso ="Camarote Superior"
    }
}

