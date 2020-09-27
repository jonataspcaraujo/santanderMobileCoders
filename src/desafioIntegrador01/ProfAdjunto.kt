package desafioIntegrador01

class ProfAdjunto(private var qtdHrMonitoria: Int = -1): Professor() {
    init{
        var horas: Int = qtdHrMonitoria
        horas?.let{
            while(horas < 0 ){
                print("Horas Monitoria por semana: ")
                try {
                    horas = readLine()?.toInt() ?: continue
                    if (horas >= 0) {
                        setQtdMonitoria(horas)
                    }
                }
                catch (exception: NumberFormatException){
                    println("Valor de formato inválido")
                }
            }
        }
    }
    private fun setQtdMonitoria(qtd: Int){
        this.qtdHrMonitoria = qtd
    }
    fun getQtMonitoria() = this.qtdHrMonitoria
}