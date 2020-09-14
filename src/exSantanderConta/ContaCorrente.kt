package exSantanderConta

class ContaCorrente(cliente: Cliente, var limiteChequeEspecial: Double = 0.0 ):
    Conta(cliente){
    var limiteConta = this.saldoConta+limiteChequeEspecial

    override fun sacarValor(valor: Double) {
        if (limiteConta > valor) {
            this.saldoConta -= valor
            limiteConta -= valor
            println("Saque realizado com sucesso")
        } else{
            println("Saldo não disponível")
        }
    }
    override fun consultarSaldo() {
        println ("Saldo em conta: R$ $saldoConta")
        println ("Saldo disponível para saque: R$ $limiteConta")
        println ("Limite Cheque Especial: R$ $limiteChequeEspecial")
    }
    fun depositarValor(cheque: Cheque){
        if (cheque.getValorCheque() > 0){
            this.saldoConta += cheque.getValorCheque()
            println("Depósito realizado com sucesso")
        } else{
            println("Verificar cheque")
        }
    }
}