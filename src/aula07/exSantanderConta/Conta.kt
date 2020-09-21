package aula07.exSantanderConta

abstract class Conta (private var cliente: Cliente) {

    protected var saldoConta: Double = 0.0

    abstract fun sacarValor(valor:Double);

    open fun depositarValor(valor: Double){
        saldoConta+=valor
        println("Depósito realizado com sucesso. Saldo Disponível: $saldoConta")
        }
    open fun consultarSaldo() {
        println ("Saldo disponível em conta: R$ $saldoConta")
    }
}