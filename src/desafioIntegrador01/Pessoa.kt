package desafioIntegrador01

abstract class Pessoa(
        private var codigo: Int = 0,
        private var nome: String? = null,
        private var sobrenome: String? = null) {

    init{
        println("Verificando Situação Cadastral")
        this.codigo?: verificaMatricula()
        if(this.codigo <= 0) verificaMatricula()
        this.nome?: verificaNome()
        this.sobrenome?: verificaSobrenome()
    }
    private fun verificaMatricula(){
        print("matrícula: ")
        var cod = this.codigo
        cod?.let {
            while(cod <= 0){
                print("matrícula: ")
                try{
                    cod = readLine()?.toInt()?: continue
                    if(cod > 0)
                        setCodigo(cod)
                }
                catch (exception: NumberFormatException){
                    println("Código não reconhecido. Informe código numerico")
                }
            }
        }
    }
    private fun verificaNome(){
        var aux: String? = this.nome
        print("Nome: ")
        aux = readLine()
        aux?.let {
            setNome(aux.toString())
        }

    }
    private fun verificaSobrenome(){
        print("Sobrenome: ")
        val aux = readLine()
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