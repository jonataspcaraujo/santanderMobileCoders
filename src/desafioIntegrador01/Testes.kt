package desafioIntegrador01

import java.time.LocalDate



fun main(){
   println("Olá")
//   val codigo = 123
//   val nome = "jonatas"
//   val sobrenome = "araujo"
//
//   val aluno = Aluno(codigo,nome,sobrenome)

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

//   val aluno1 = Aluno(123,"jonatas", "araujo")
//   val profT = ProfTitular("Kotlin")
//   val profA = ProfAdjunto(8)
//   val curso1 = Curso("Curso A",369,10,profT,profA)
//   val matricula = Matricula(aluno1, curso1)
//   println("Matricula Atual")
//   println("Aluno: ${matricula.getMatAluno().getNome()}")
//   println("Curso: ${matricula.getMatCurso().getNomeCurso()}")
//   println("Data matricula: ${matricula.getDataMatricula()}")

   var gestor = DigitalHouseManager()
   gestor.registrarCurso("Kotlin", 999,1)
   gestor.registrarCurso("Android", 888,10)
//   gestor.registrarCurso("Android", 888,50)
//   gestor.registrarCurso("Scrum", 777,20)
//   println("Lista de Cursos após inclusões")
//   var cursos = gestor.getCursos()
//   cursos.forEach {
//      println("${it.getCodigoCurso()} - ${it.getNomeCurso()}")
//   }
//   gestor.excluirCurso(888)
//   gestor.excluirCurso(963)
//   println("Lista de Cursos após remoção")
//   cursos.forEach {
//      println("${it.getCodigoCurso()} - ${it.getNomeCurso()}")
////   }
//   gestor.registrarProfessor("jonatas","araujo",123,8)
//   gestor.registrarProfessor("pedro","araujo",456,4)
////   gestor.registrarProfessor("pedro","araujo",456,4)
//   val adjuntos = gestor.getProfsAdjunto()
//   println("Professores Adjuntos")
//   adjuntos.forEach {
//      println("${it.getCodigo()} - ${it.getNome()} - ${it.getQtMonitoria()} horas/semana")
//   }
//   gestor.registrarProfessor("jonatas","araujo",123,"Kotlin")
//   gestor.registrarProfessor("matheus","araujo",789,"Android")
////   gestor.registrarProfessor("matheus","araujo",456,"Scrum")
//   val titulares = gestor.getProfsTitular()
//   println("Professores Titulares")
//   titulares.forEach {
//      println("${it.getCodigo()} - ${it.getNome()} - ${it.getEspecialidade()} ")
//   }
//   gestor.excluirProfessor(123)
//   gestor.excluirProfessor(456)
//   gestor.excluirProfessor(789)
//   gestor.excluirProfessor(369)

   gestor.matricularAluno("jonatas","araujo",852)
   gestor.matricularAluno("jamilli","santana",741)
//   gestor.matricularAluno("ana","elisabeth",741)
//   val alunos = gestor.getAlunos()
//   alunos.forEach {
//      println("${it.getCodigo()} - ${it.getNome()} ${it.getSobrenome()} ")
//   }
   val matriculas = gestor.getMatriculas()
//   gestor.matricularAluno(852,999)
//   gestor.matricularAluno(741,999)
//   gestor.matricularAluno(852,888)
//   gestor.matricularAluno(741,888)
//   matriculas.forEach {
//      println("${it.getMatAluno().getNome()} - ${it.getMatCurso().getNomeCurso()} DataMatricula: ${it.getDataMatricula()}")
//   }
   gestor.registrarProfessor("Pedro","Araujo",789,8)
   gestor.registrarProfessor("Ana","Elisabeth",456,"Historia")
   gestor.alocarProfessores(999,456,789)
   var curso: Curso? = null
   curso = gestor.getCurso(999)

   curso?.let{
      println("Ficha do curso: (${it.getCodigoCurso()}) ${it.getNomeCurso()}")
      println("Professor Titular: ${it.getProfessorTitular()?.getNome()} Especialidade: ${it.getProfessorTitular()?.getEspecialidade()}")
      println("Professor Adjunto: ${it.getProfessorAdjunto()?.getNome()} Horas/Semana: ${it.getProfessorAdjunto()?.getQtMonitoria()}")
      println("Vagas: ${it.getVagasDisponíveis()}")
   }
//   gestor.excluirCurso(999)
   gestor.excluirProfessor(789)
   curso = gestor.getCurso(999)
   curso?:println("Curso não encontrado")
   curso?.let{
      println("Ficha do curso: (${it.getCodigoCurso()}) ${it.getNomeCurso()}")
      println("Professor Titular: ${it.getProfessorTitular()?.getNome()} Especialidade: ${it.getProfessorTitular()?.getEspecialidade()}")
      println("Professor Adjunto: ${it.getProfessorAdjunto()?.getNome()} Horas/Semana: ${it.getProfessorAdjunto()?.getQtMonitoria()}")
      println("Vagas: ${curso.getVagasDisponíveis()}")
   }

}