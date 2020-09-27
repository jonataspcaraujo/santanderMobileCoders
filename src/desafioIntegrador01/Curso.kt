package desafioIntegrador01

import aula08.retornaValorPadrao

class Curso(private var nome: String? = null,
            private var codigo: Int = -1,
            private var maxVagas: Int = -1){

    private var profTitular: ProfTitular? = null
    private var profAdjunto: ProfAdjunto? = null
    private var lAlunos = mutableSetOf<Aluno>()

    init{
        println("curso criado")
    }

    fun adicionarAluno(aluno: Aluno):Boolean{
        aluno?.let{
            if(getVagasDisponíveis() > 0) {
                this.lAlunos.add(aluno)
                return true
            } else return false
        }
    }
    fun removerAluno(aluno: Aluno){
        aluno?.let{
            val rm = lAlunos.remove(aluno)
            if (rm) {
                println("Aluno removido: ${aluno.getNome()} - ${aluno.getCodigo()}")
            } else {
                println("Aluno não encontrado")
            }
        }
    }
    private fun setProfessor(professor: ProfTitular){
        this.profTitular = professor
    }
    private fun setProfessor(professor: ProfAdjunto){
        this.profAdjunto = professor
    }
    private fun setNomeCurso(nome: String){
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
    fun getVagasDisponíveis() = this.maxVagas - lAlunos.size



}


