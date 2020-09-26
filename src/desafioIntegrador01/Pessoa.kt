package desafioIntegrador01

abstract class Pessoa() {
    private var nome: String? = null
    private var sobrenome: String? = null
    private var codigo: Int = 0

    init{
        println("Atualização Cadastral")
        print("Código: ")
        val cod = readLine()
        cod?.let {
            try{
                setCodigo(cod.toInt())
            }
            catch (exception: NumberFormatException){
                println("Código não reconhecido. Informe código numerico")
            }

        }
        var aux: String? = null
        print("Nome: ")
        aux = readLine()
        aux?.let {
            setNome(aux.toString())
        }
        print("Sobrenome: ")
        aux = readLine()
        aux?.let {
            setSobrenome(aux.toString())
        }
    }
    private fun setNome(nome: String){
        this.nome = nome
    }
    private fun setSobrenome(sobrenome: String){
        this.sobrenome = sobrenome
    }
    private fun setCodigo(codigo: Int){
        this.codigo = codigo
    }
    fun getNome(): String{
        return this.nome.toString()
    }
    fun getSobrenome(): String{
        return this.sobrenome.toString()
    }
    fun getCodigo(): Int{
        return this.codigo
    }
}