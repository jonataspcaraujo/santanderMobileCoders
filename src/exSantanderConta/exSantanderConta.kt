package exSantanderConta

fun main(){
    println("Exercício Santander Conta")
    var cliente = Cliente("123", "", "", "324")
    var cheque = Cheque(1236.56,"1235", "12/12/2020")
    println("banco Emissor: ${cheque.getBancoEmissor()}")

}