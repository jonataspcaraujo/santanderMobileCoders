package desafioIntegrador01

class DigitalHouseManager() {
    private var sAlunos = mutableSetOf<Aluno>()
    private var sProfessores = mutableSetOf<Professor>()
    private var sCursos = mutableSetOf<Curso>()
    private var lMatriculas = mutableListOf<Matricula>()

    
    init {
        // TODO: 27/09/2020  
    }
    fun registrarCurso(nome: String, codigoCurso: Int, qtdVagas: Int){
        val curso = Curso(nome, codigoCurso,qtdVagas)
        if(sCursos.isEmpty()) {
            sCursos.add(curso)
         //   println("Lista de cursos iniciada")
        } else if (!hasCurso(codigoCurso)){
            sCursos.add(curso)
         //   println("curso adicionado")
        } else{
           // println("curso já existe")
        }
    }
    private fun hasCurso(codigo: Int):Boolean{
        sCursos.forEach {
            if (it.getCodigoCurso() == codigo) {
                println("Cod curso:${it.getCodigoCurso()} codigo: $codigo ")
                return true
            }
        }
        return false
    }
    fun excluirCurso(codigoCurso: Int){
        var curso: Curso? = null
        sCursos.forEach {
            if(it.getCodigoCurso() == codigoCurso){
                curso = it
//                println("Curso a remover: $codigoCurso")
            }
        }
        curso?.let{
            sCursos.remove(it)
//            println("Curso Removido: ${it.getCodigoCurso()} - ${it.getNomeCurso()}")
        }
        curso?: println("Curso não encontrado: $codigoCurso")


    }
    fun registrarProfTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String){
        // TODO: 27/09/2020  
    }
    fun registrarProfAdjunto(nome: String, sobrenome: String, codigo: Int, especialidade: String){
        // TODO: 27/09/2020  
    }
    fun excluirProfessor(codigo: Int){
        // TODO: 27/09/2020  
    }
    fun matricularAluno(nome: String, sobrenome: String, codigo: Int){
        // TODO: 27/09/2020  
    }
    fun matricularAluno(codAluno: Int, codCurso: Int){
        // TODO: 27/09/2020  
    }
    fun alocarProfessores(codCurso: Int,codProfT: Int, codProfA: Int ){
        // TODO: 27/09/2020
    }
    fun getRelacaoCursos() = sCursos
}