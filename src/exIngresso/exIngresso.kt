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






