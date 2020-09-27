package desafioIntegrador01

import java.time.LocalDateTime

class Matricula(private var aluno: Aluno,
                private var curso: Curso) {

    private var dataMatricula: LocalDateTime? = null
    init{
        this.dataMatricula = LocalDateTime.now()
    }

    fun getMatAluno() = this.aluno
    fun getMatCurso() = this.curso
    fun getDataMatricula() = this.dataMatricula?.toLocalDate()

}