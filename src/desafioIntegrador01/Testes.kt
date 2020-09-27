package desafioIntegrador01

import java.time.LocalDate



fun main(){
   println("Olá")
   val codigo = 123
   val nome = "jonatas"
   val sobrenome = "araujo"

//   val aluno = Aluno()

//   println("------ Teste Aluno - Início ------")
//   println("Código: ${aluno.getCodigo()}")
//   println("Aluno: ${aluno.getNome()} ${aluno.getSobrenome()}")
//   println("------ Teste Aluno - Final ------")

//   val professor = ProfTitular("kotlin")
//   println(professor.getEspecialidade())
//   professor.getTempoDeCasa()
//   println("Tempo de Casa: ${professor.getTempoDeCasa().get("ano")} anos, " +
//           "${professor.getTempoDeCasa().get("mes")} meses e " +
//           "${professor.getTempoDeCasa().get("dia")} dias")

      val professor2 = ProfAdjunto()
      println("Horas: ${professor2.getQtMonitoria()}")


}