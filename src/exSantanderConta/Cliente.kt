package exSantanderConta

class Cliente(codigo: String = "", nome: String = "", rg: String = "", cpf: String = "") {

    private var codCliente = codigo
    private var nomeCliente = nome
    private var rgCliente = rg
    private var cpfCliente = cpf

    init{
        verificarCadastro()
    }
    fun verificarCadastro() {
        println("Verificação de Cadastro de Cliente")
        if (codCliente == "")   setCodCliente()
        if (nomeCliente == "")  setNomeCliente()
        if (rgCliente == "")    setRgCliente()
        if (cpfCliente == "")   setCpfCliente()
        println("Cadastro verificado")
    }
    private fun setCodCliente() {
        print("Informe o Código do Cliente: ")
        codCliente = readLine().toString()
    }
    private fun setRgCliente() {
        print("Informe o RG do Cliente: ")
        rgCliente = readLine().toString()
    }
    private fun setNomeCliente() {
        print("Informe o Nome do Cliente: ")
        nomeCliente = readLine().toString()
    }
    private fun setCpfCliente() {
        print("Informe o CPF do Cliente: ")
        cpfCliente = readLine().toString()
    }
    fun getCodCliente():String{
        return codCliente
    }
    fun getNomeCliente():String{
        return nomeCliente
    }
    fun getRgCliente():String{
        return rgCliente
    }
    fun getCpfCliente():String{
        return cpfCliente
    }
}