package desafioIntegrador01
/*
 * Esta classe de teste visa verificar as operações de registro e exclusão de professores
 */
fun main(){
    val gestor = DigitalHouseManager()
    val alunos = gestor.getAlunos()

    //matriculando alunos
    gestor.matricularAluno("Jonatas", "Araujo", 99)
    gestor.matricularAluno("Pedro", "Araujo", 98)
    gestor.matricularAluno("Araujo", "Araujo", 97)

    //Matriculando aluno cuja matricula já existe
    gestor.matricularAluno("Jamilli", "Paulino", 99)

    //exibindo relação de alunos
    alunos.forEach {
        println ("${it.getCodigo()} ${it.getNome()} ${it.getSobrenome()}")
    }

    gestor.registrarCurso("Kotlin", 9999, 2)
    val cursos = gestor.getCursos()
    println("Curso: ${gestor.getCurso(9999)?.getNomeCurso()} \tVagas: ${gestor.getCurso(9999)?.getVagasDisponíveis()}")
    val matriculas = gestor.getMatriculas()
    gestor.matricularAluno(99,9999)
    gestor.matricularAluno(98,9999)
    //Matriculando aluno em curso com vagas esgotadas
    gestor.matricularAluno(97,9999)
    //Matriculando aluno não encontrado
    gestor.matricularAluno(90,9999)
    println("Curso: ${gestor.getCurso(9999)?.getNomeCurso()} \tVagas: ${gestor.getCurso(9999)?.getVagasDisponíveis()}")

    val alunosCurso = gestor.getCurso(9999)?.getAlunos()
    println("Relação Alunos - Curso: ${gestor.getCurso(9999)?.getNomeCurso()}")
    alunosCurso?.forEach {
        println("${it.getCodigo()}  ${it.getNome()} ${it.getSobrenome()}")
    }
//    val aluno = gestor.getAluno()
    gestor.getAluno(99)?.let { gestor.getCurso(9999)?.excluirAluno(it) }
    println("Relação Alunos - Curso: ${gestor.getCurso(9999)?.getNomeCurso()}")
    alunosCurso?.forEach {
        println("${it.getCodigo()}  ${it.getNome()} ${it.getSobrenome()}")
    }
}