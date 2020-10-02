package desafioIntegrador01

import java.time.LocalDate

class ProfAdjunto(codigo: Int = -1, nome: String? = null, sobrenome: String? = null, dataContratacao: LocalDate? = null,
                  private var qtdHrMonitoria: Int = -1): Professor(codigo,nome,sobrenome, dataContratacao) {

    init{
//        var horas: Int = qtdHrMonitoria
//        horas?.let{
//            while(horas < 0 ){
//                print("Horas Monitoria por semana: ")
//                try {
//                    horas = readLine()?.toInt()?: continue
//                    if (horas >= 0) {
//                        setQtdMonitoria(horas)
//                    }
//                }
//                catch (exception: NumberFormatException){
//                    println("Valor de formato inválido")
//                }
//            }
//        }
    }
    private fun setQtdMonitoria(qtd: Int){
        this.qtdHrMonitoria = qtd
    }
    fun getQtMonitoria() = this.qtdHrMonitoria
}