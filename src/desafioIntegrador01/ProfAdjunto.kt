package desafioIntegrador01

import java.time.LocalDate
/*
* Classe que representa professor adjunto.
 */
class ProfAdjunto(codigo: Int = -1,
                  nome: String? = null,
                  sobrenome: String? = null,
                  dataContratacao: LocalDate? = null,
                  private var qtdHrMonitoria: Int = -1):
        Professor(codigo,nome,sobrenome, dataContratacao) {

    /* Inicia o objeto e verifica se a quantidade de horas de monitoria foi informada.
    * Caso a especialidade seja menor que zero, é solicitado que o usuário a informe, via linha de comando.
    * Demais parâmentros do construr são verificados nas classes Professor e Pessoa.
     */
    init{
        verificaHorasMonitoria()
    }
    private fun verificaHorasMonitoria(){
        var horas: Int = qtdHrMonitoria
        horas?.let{
            while(horas < 0 ){
                print("Horas Monitoria por semana: ")
                try {
                    horas = readLine()?.toInt()?: continue
                    if (horas >= 0) {
                        this.qtdHrMonitoria = horas
                    }
                }
                catch (exception: NumberFormatException){
                    println("Valor de formato inválido")
                }
            }
        }
    }
    fun getQtMonitoria() = this.qtdHrMonitoria
}