package desafioIntegrador01
/*
 * Esta classe de teste visa verificar as operações de registro e exclusão de professores
 */
fun main(){
    val gestor = DigitalHouseManager()
    var profTit = gestor.getProfsTitular()
    var profAdj = gestor.getProfsAdjunto()

    //Registrando professores Adjuntos
    gestor.registrarProfessor("Jonatas","Araujo", 789,8)
    gestor.registrarProfessor("Jamilli","Paulino", 987,4)
    gestor.registrarProfessor("Pedro", "Araujo", 456,6)
    gestor.registrarProfessor("Matheus", "Araujo", 456,6)
    println("Professores Adjuntos")
    profAdj.forEach {
        println("${it.getCodigo()} ${it.getNome()} ${it.getSobrenome()} ${it.getDataContratacao()} " +
                "Tempo de Casa: ${it.getTempoDeCasa()}")
    }
    //Registrando professores Titulares
    gestor.registrarProfessor("Jonatas", "Araujo", 789,"Android")
    gestor.registrarProfessor("Ana", "Elisabeth",963,"POO")
    gestor.registrarProfessor("Matheus", "Araujo", 852,"Kotlin")
    println("Professores Titulares")
    profTit.forEach {
        println("${it.getCodigo()} ${it.getNome()} ${it.getSobrenome()} ${it.getDataContratacao()} " +
                "Tempo de Casa: ${it.getTempoDeCasa()}")
    }

    //Excluindo Professor e exibindo relação atualizada de professores
    gestor.excluirProfessor(789)
    println("Professores Adjuntos")
    profAdj.forEach {
        println("${it.getCodigo()} ${it.getNome()} ${it.getSobrenome()} ${it.getDataContratacao()} " +
                "Tempo de Casa: ${it.getTempoDeCasa()}")
    }
    println("Professores Titulares")
    profTit.forEach {
        println("${it.getCodigo()} ${it.getNome()} ${it.getSobrenome()} ${it.getDataContratacao()} " +
                "Tempo de Casa: ${it.getTempoDeCasa()}")
    }

    gestor.registrarCurso("Kotlin", 9999, 2)

    // Alocando professores no curso e exibindo ficha técnica do curso
    gestor.alocarProfessores(9999,852,987)
    println("Ficha Técnica do Curso")
    println("Nome: ${gestor.getCurso(9999)?.getNomeCurso()} Vagas: ${gestor.getCurso(9999)?.getVagasDisponíveis()}")
    println("Professor Titular: ${gestor.getCurso(9999)?.getProfessorTitular()?.getNome()}")
    println("Professor Adjunto: ${gestor.getCurso(9999)?.getProfessorAdjunto()?.getNome()}")

}