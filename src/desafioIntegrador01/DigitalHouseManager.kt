package desafioIntegrador01

class DigitalHouseManager() {
    private var sAlunos = mutableSetOf<Aluno>()
    private var sProfessores = mutableSetOf<Professor>()
    private var lCursos = mutableListOf<Curso>()
    private var lMatriculas = mutableListOf<Matricula>()

    
    init {
        // TODO: 27/09/2020  
    }
    fun registrarCurso(nome: String, codigoCurso: Int, qtdVagas: Int){
        // TODO: 27/09/2020  
    }
    fun excluirCurso(codigoCurso: Int){
        // TODO: 27/09/2020  
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
}