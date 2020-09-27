package desafioIntegrador01

import java.time.LocalDate



fun main(){
   println("Olá")
   val codigo = 123
   val nome = "jonatas"
   val sobrenome = "araujo"

   val aluno = Aluno(codigo,nome,sobrenome)

//   println("------ Teste Aluno - Início ------")
//   println("Código: ${aluno.getCodigo()}")
//   println("Aluno: ${aluno.getNome()} ${aluno.getSobrenome()}")
//   println("------ Teste Aluno - Final ------")

//   val professor = ProfTitular()
//   println(professor.getEspecialidade())
//   professor.getTempoDeCasa()
//   println("Tempo de Casa: ${professor.getTempoDeCasa().get("ano")} anos, " +
//           "${professor.getTempoDeCasa().get("mes")} meses e " +
//           "${professor.getTempoDeCasa().get("dia")} dias")
//     val professor2 = ProfAdjunto(8)
//      println("Horas: ${professor2.getQtMonitoria()}")

//   val curso = Curso()
//   curso.associarProfessor(professor)
//   curso.associarProfessor(professor2)
//   println("nome: ${curso.getNomeCurso()}")
//   println("codigo: ${curso.getCodigoCurso()}")
//   println("ProfTitular: ${curso.getProfessorTitular()?.getNome()}")
//   println("ProfAdjunto: ${curso.getProfessorAdjunto()?.getNome()}")
//   println("Total Vagas: ${curso.getQtdVagas()}")
//   curso.adicionarAluno(aluno)
//   curso.adicionarAluno(Aluno(10,"Aluno x", "ABC"))
//   println("Vagas Disponíveis: ${curso.getVagasDisponíveis()}")
//   println("Relação de Alunos Alunos")
//   curso.getAlunos().forEach {
//      println("${it.getCodigo()} - ${it.getNome()}")
//   }
//   curso.removerAluno(aluno)
//   println("Vagas Disponíveis: ${curso.getVagasDisponíveis()}")

   val aluno1 = Aluno(123,"jonatas", "araujo")
   val profT = ProfTitular("Kotlin")
   val profA = ProfAdjunto(8)
   val curso1 = Curso("Curso A",369,10,profT,profA)
   val matricula = Matricula(aluno1, curso1)
   println("Matricula Atual")
   println("Aluno: ${matricula.getMatAluno().getNome()}")
   println("Curso: ${matricula.getMatCurso().getNomeCurso()}")
   println("Data matricula: ${matricula.getDataMatricula()}")
}