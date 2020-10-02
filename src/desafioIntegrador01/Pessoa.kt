package desafioIntegrador01
/* Classe abstrata para subsidiar propriedades e métodos comuns às classes Aluno e Professor.
 *
 */
abstract class Pessoa(
        private var codigo: Int = 0,
        private var nome: String? = null,
        private var sobrenome: String? = null) {

    /* verificação dos dados passados na criação do objeto. Em caso de incosistências, novos dados são solicitados
    * ao usuário, via linha de comando, através de métodos privados
    */
    init{
//      println("Verificando Situação Cadastral")
        this.codigo?: verificaMatricula()
        if(this.codigo <= 0) verificaMatricula()
        this.nome?: verificaNome()
        this.sobrenome?: verificaSobrenome()
    }
    /* Funcao privada para verificar o valor do código informado no construtor do objeto e ajustar, mediante interação
    * do usuário, caso necessário
    */
    private fun verificaMatricula(){
//        print("matrícula: ")
        var cod = this.codigo
        cod?.let {
            while(cod <= 0){
//                print("matrícula: ")
                try{
                    cod = readLine()?.toInt()?: continue
                    if(cod > 0)
                       this.codigo= cod
                }
                catch (exception: NumberFormatException){
                    println("Código não reconhecido. Informe código numerico")
                }
            }
        }
    }
    /* Funcao privada para verificar o valor do nome informado no construtor do objeto e ajustar, mediante interação
    * do usuário, caso necessário
    */
    private fun verificaNome(){
        var aux: String? = this.nome
//        print("Nome: ")
        aux = readLine()
        aux?.let {
            this.nome = aux.toString()
        }
    }
    /* Funcao privada para verificar o valor do sobrenome informado no construtor do objeto e ajustar, mediante interação
    * do usuário, caso necessário
    */
    private fun verificaSobrenome(){
//        print("Sobrenome: ")
        val aux = readLine()
        aux?.let {
            this.sobrenome = aux.toString()
        }

    }

    fun getNome() = this.nome.toString()
    fun getSobrenome() = this.sobrenome.toString()
    fun getCodigo() = this.codigo
}