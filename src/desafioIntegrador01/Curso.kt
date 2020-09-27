package desafioIntegrador01

import aula08.retornaValorPadrao

class Curso(private var nome: String? = null,
            private var codigo: Int = -1,
            private var maxVagas: Int = -1){

    private var profTitular: ProfTitular? = null
    private var profAdjunto: ProfAdjunto? = null
    private var sAlunos = mutableSetOf<Aluno>()


    init{

//        println("cadastrando curso")
//        print("Código do Curso: ")
//        val cod = readLine()
//        cod?.let {
//            try{
//                setCodigoCurso(cod.toInt())
//            }
//            catch (exception: NumberFormatException){
//                println("Código não reconhecido. Informe código numerico")
//            }
//        }
//        var aux: String? = null
//        print("Nome do Curso: ")
//        aux = readLine()
//        aux?.let {
//            setNomeCurso(aux.toString())
//        }
//      //Iniciando total de vagas
//        var max: Int = maxVagas
//        max?.let {
//            while (max < 0) {
//                print("Total de vagas: ")
//                try {
//                    max = readLine()?.toInt()?: continue
//                    if (max >= 0) {
//                        setMaxVagas(max)
//                        break
//                    }
//                } catch (exception: NumberFormatException) {
//                    println("Valor de formato inválido")
//                }
//            }
//        }
//

    }

    fun adicionarAluno(aluno: Aluno):Boolean{
        aluno?.let{
            if(getVagasDisponíveis() > 0) {
                this.sAlunos.add(aluno)
                return true
            } else return false
        }
    }
    fun removerAluno(aluno: Aluno){
        aluno?.let{
            val rm = sAlunos.remove(aluno)
            if (rm) {
                println("Aluno removido: ${aluno.getNome()} - ${aluno.getCodigo()}")
            } else {
                println("Aluno não encontrado")
            }
        }
    }
    fun associarProfessor(professor: ProfTitular){
        this.profTitular = professor
    }
    fun associarProfessor(professor: ProfAdjunto){
        this.profAdjunto = professor
    }
    fun associarProfessor(profT: ProfTitular, profA: ProfAdjunto){
        this.profTitular = profT
        this.profAdjunto = profA
    }
    fun setNomeCurso(nome: String){
        this.nome = nome
    }
    private fun setCodigoCurso(valor: Int){
        this.codigo = valor
    }
    private fun setMaxVagas(valor: Int){
        this.maxVagas = valor
    }

    fun getProfessorAdjunto() = this.profAdjunto
    fun getProfessorTitular() = this.profTitular
    fun getNomeCurso() = this.nome
    fun getCodigoCurso() = this.codigo
    fun getQtdVagas() = this.maxVagas
    fun getVagasDisponíveis() = this.maxVagas - sAlunos.size
    fun getAlunos() = this.sAlunos




}


