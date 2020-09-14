package exSantanderConta

fun main(){
    println("Exercício Santander Conta")
    val cliente = Cliente("123", "Jonatas", "256", "324")
    val cheque = Cheque(1236.56,"1235", "12/12/2020")
    val poupanca = ContaPoupanca(cliente)

    poupanca.consultarSaldo()
    poupanca.depositarValor(100.00)
    poupanca.consultarSaldo()
    poupanca.recolherJurosAcumulados(0.10)
    poupanca.consultarSaldo()
    poupanca.sacarValor(50.0)
    poupanca.recolherJurosAcumulados(0.10)

    
}