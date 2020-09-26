package desafioIntegrador01

import java.time.LocalDate



fun main(){
   println("Olá")

//   val aluno = Aluno()

//   println("------ Teste Aluno - Início ------")
//   println("Código: ${aluno.getCodigo()}")
//   println("Aluno: ${aluno.getNome()} ${aluno.getSobrenome()}")
//   println("------ Teste Aluno - Final ------")

   val professor = Professor()
   professor.getTempoDeCasa()
   println("Tempo de Casa: ${professor.getTempoDeCasa().get("ano")} anos, " +
           "${professor.getTempoDeCasa().get("mes")} meses e " +
           "${professor.getTempoDeCasa().get("dia")} dias")



}