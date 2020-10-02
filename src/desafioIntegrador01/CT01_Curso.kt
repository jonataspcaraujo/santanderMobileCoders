package desafioIntegrador01
/*
 * Esta classe de teste visa verificar as operações de registro e exclusão de curso
 */
fun main(){
    // Criando o gestor
    val gestor = DigitalHouseManager()
    var cursos = gestor.getCursos()

    println("--------------------------------------------------------------------")
    println("Resgistrando cursos")
    gestor.registrarCurso("POO",999,10)
    gestor.registrarCurso("Kotlin",888,10)
    gestor.registrarCurso("Android",777,10)
    println("-------------------------------------------------------------------")
    println(" Resgistrando curso já existente")
    gestor.registrarCurso("POO",999,20)
    println("-------------------------------------------------------------------")
    println("Catálogo de Cursos")
    cursos.forEach {
        println("${it.getCodigoCurso()} \t${it.getNomeCurso()} \tVagas:${it.getVagasDisponíveis()}")
    }
    println("-------------------------------------------------------------------")
    println("Excluindo Curso existente")
    val curso = gestor.getCurso(888)
    gestor.excluirCurso(888)
    println("-------------------------------------------------------------------")
    println("Excluindo Curso inexistente")
    gestor.excluirCurso(555)
    println("-------------------------------------------------------------------")
    println("Catálogo de Cursos após exclusões")
    cursos.forEach {
        println("${it.getCodigoCurso()} \t${it.getNomeCurso()} \tVagas:${it.getVagasDisponíveis()}")
    }
    println("Fim do Teste")
}