package aula07.exSantanderConta

class ContaPoupanca(var cliente: Cliente):
    Conta(cliente){
    private var rendimentoJuros: Double = 0.0
    init {
        this.saldoConta =0.0
    }
    override fun sacarValor(valor: Double){
        if (this.saldoConta > 0 && this.saldoConta > valor){
            this.saldoConta -= valor
            println("Saque realizado com sucesso. Saldo disponível: R$ ${this.saldoConta}")

        } else{
            println("saldo não disponível")
        }
    }
    fun recolherJurosAcumulados(taxa: Double){
        rendimentoJuros += this.saldoConta*taxa
        println("Recolhimento de Juros: R$ $rendimentoJuros")

    }
}
