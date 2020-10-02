package desafioIntegrador01

class Curso(private var nome: String? = null,
            private var codigo: Int = -1,
            private var maxVagas: Int = -1){

    private var profTitular: ProfTitular? = null
    private var profAdjunto: ProfAdjunto? = null
    private var sAlunos = mutableSetOf<Aluno>()

    /* verificação dos dados passados na criação do objeto. Em caso de incosistências, novos dados são
    *  solicitados ao usuário, via linha de comando, através de métodos privados
    */
    init{
        this.codigo?: verificaCodigo()
        if(this.codigo <= 0) verificaCodigo()
        this.nome?: verificaNome()
        this.maxVagas?: verificaVagas()
        if(this.maxVagas <= 0) verificaVagas()
   }
    /* Esta função permite adicionar um aluno à lista. O método retornará true se o aluno puder ser
    * adicionado ou false caso não haja vagas disponíveis.
     */
    fun adicionarAluno(aluno: Aluno):Boolean{
        aluno?.let{
            if(getVagasDisponíveis() > 0) {
                this.sAlunos.add(aluno)
                return true
            } else return false
        }
    }
    /* Esta função permite excluir um aluno da lista de alunos do curso
     */
    fun excluirAluno(aluno: Aluno){
        aluno?.let{
            val rm = sAlunos.remove(aluno)
            if (rm) {
                println("Aluno removido: ${aluno.getNome()} - ${aluno.getCodigo()}")
            } else {
                println("Aluno não encontrado")
            }
        }
    }

    //Funçoes Auxiliares
    fun associarProfessor(professor: ProfTitular){
        this.profTitular = professor
    }
    fun associarProfessor(professor: ProfAdjunto){
        this.profAdjunto = professor
    }

    fun getProfessorAdjunto() = this.profAdjunto
    fun getProfessorTitular() = this.profTitular
    fun getNomeCurso() = this.nome
    fun getCodigoCurso() = this.codigo
    fun getQtdVagas() = this.maxVagas
    fun getVagasDisponíveis() = this.maxVagas - sAlunos.size
    fun getAlunos() = this.sAlunos

    /* Funcao privada para verificar o valor do código informado no construtor do objeto e ajustar, mediante interação
    * do usuário, caso necessário
    */
    private fun verificaCodigo(){
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
    /* Funcao privada para verificar o valor do código informado no construtor do objeto e ajustar, mediante interação
    * do usuário, caso necessário
    */
    private fun verificaVagas(){
//        print("matrícula: ")
        var cod = this.maxVagas
        cod?.let {
            while(cod <= 0){
//                print("matrícula: ")
                try{
                    cod = readLine()?.toInt()?: continue
                    if(cod > 0)
                        this.maxVagas= cod
                }
                catch (exception: NumberFormatException){
                    println("Código não reconhecido. Informe código numerico")
                }
            }
        }
    }





}


