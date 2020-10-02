package desafioIntegrador01
/*
 * Esta classe de teste visa verificar as operações de registro e exclusão de curso
 */
fun main(){
    // Criando o gestor
    val gestor = DigitalHouseManager()
    var cursos = gestor.getCursos()

    // Resgistrando cursos
    gestor.registrarCurso("POO",999,10)
    gestor.registrarCurso("Kotlin",888,10)
    gestor.registrarCurso("Android",777,10)
    //Adicionando curso já existente
    gestor.registrarCurso("POO",999,20)

    // exibindo catálogo de cursos cadastrados
    println("Catálogo de Cursos")
    cursos.forEach {
        println("${it.getCodigoCurso()} \t${it.getNomeCurso()} \tVagas:${it.getVagasDisponíveis()}")
    }
    //excluindo cursos
    gestor.excluirCurso(888)

    //Excluindo curso inexistente no catálogo
    gestor.excluirCurso(555)

    //Exibindo catálogo atualizado após exclusões
    cursos.forEach {
        println("${it.getCodigoCurso()} \t${it.getNomeCurso()} \tVagas:${it.getVagasDisponíveis()}")
    }

}