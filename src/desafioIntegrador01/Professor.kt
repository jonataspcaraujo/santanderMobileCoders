package desafioIntegrador01

import java.time.LocalDate

abstract class Professor(codigo: Int = -1, nome: String? = null, sobrenome: String? = null,
                         private var dataContratacao: LocalDate? = null):
        Pessoa(codigo,nome,sobrenome) {

    /* Inicia o objeto Professor (titular/adjunto) e verifica se a data de contratação foi informada.
    * Caso data de contratação seja null, é solicitado que o usuário informe a data de contratação
     */
    init{
        dataContratacao?:setDataContratacao()
    }

    /* Função privada para cadastrar a data de contratação de um professor, caso o objeto tenha sido criado
     * tendo esta propriedade com valor nulo
     */
    private fun setDataContratacao(){
        println("Data de contratação do professor ${this.getNome()} (YYYY-MM-DD): ")
        val aux = readLine()
        this.dataContratacao = LocalDate.parse(aux)
    }
    // Função que retorna a data de contratação de um objeto Professor (titular/adjunto)
    fun getDataContratacao(): LocalDate?{
        return this.dataContratacao
    }
    /* Função que retorna, por extenso, a diferença temporal entre a data atual e a propriedade DataContratacao de um objeto
    * Professor (titular/adjunto)
    */
    fun getTempoDeCasa():String{
        return "${getMapTempoDeCasa().get("ano")} anos, ${getMapTempoDeCasa().get("mes")} meses e ${getMapTempoDeCasa().get("dia")} dias."


    }
    /* Função privada, auxiliar, para tratamento e calculo do tempo de casa.
    * Retorna um map cujas chaves são "ano", "mes" e "dia", correpondendo ao tempo de casa do professor.
    */
    private fun getMapTempoDeCasa(): MutableMap<String, Int>{
        val tempoDeCasa = mutableMapOf<String,Int>()
        val anos = LocalDate.now().year - (this.dataContratacao?.year ?:LocalDate.now().year )
        tempoDeCasa.put("ano",anos)
//        println("Diferenca anos: $anos")
        val meses = LocalDate.now().monthValue - (this.dataContratacao?.monthValue ?:LocalDate.now().monthValue )
        tempoDeCasa.put("mes",meses)
//        println("Diferenca meses: $meses")
        val dias = LocalDate.now().dayOfMonth - (this.dataContratacao?.dayOfMonth ?:LocalDate.now().dayOfMonth )
        tempoDeCasa.put("dia",dias)
//        println("Diferenca dia: $dias")
        return tempoDeCasa
    }


}