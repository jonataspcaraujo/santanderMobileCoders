package exSantanderConta

class Cliente() {
    private var codCliente: String = ""
    private var nomeCliente: String = ""
    private var rgCliente: String = ""
    private var cpfCliente: String = ""

    init{
        cadastrarCliente()
    }
    private fun cadastrarCliente() {
        println("Cadastro de novo cliente")
        print("Código do Cliente: ")
        codCliente = readLine().toString()
        print("Nome do Cliente: ")
        nomeCliente = readLine().toString()
        print("RG do Cliente: ")
        rgCliente = readLine().toString()
        print("CPF do Cliente: ")
        cpfCliente = readLine().toString()


    }



}