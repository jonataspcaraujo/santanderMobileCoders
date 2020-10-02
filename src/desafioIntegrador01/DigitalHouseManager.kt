package desafioIntegrador01

import java.time.LocalDate

class DigitalHouseManager() {
    private var sAlunos = mutableSetOf<Aluno>()
    private var sProfTitular = mutableSetOf<ProfTitular>()
    private var sProfAdjunto = mutableListOf<ProfAdjunto>()
    private var sCursos = mutableSetOf<Curso>()
    private var lMatriculas = mutableListOf<Matricula>()

    init {
        println("Gestor iniciado")
    }
    /* Esta função permite registrar um curso.
    * O método recebe como parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos.
    * O método deve criar um curso com os dados correspondentes e adicioná-lo à lista de cursos.
     */
    fun registrarCurso(nome: String, codigoCurso: Int, qtdVagas: Int){
        if (!hasCurso(codigoCurso)){
            sCursos.add(Curso(nome, codigoCurso,qtdVagas))
        } else{
            println("O curso $codigoCurso - $nome já existe no catálogo")
        }
    }
    /* Esta função permite excluir um curso existente no catálogo.
    * A função recebe como parâmetro o código do curso a ser removido.
     */
    fun excluirCurso(codigoCurso: Int){
        if(sCursos.remove(getCurso(codigoCurso))){
            println ("Curso removido do catálogo com sucesso.")
        } else{
            println ("Curso não encontrado no catálogo. Repita a operação")
        }
    }
    /* Esta função permite registrar um professor adjunto.
    * A função recebe como parâmetros o nome do professor, o sobrenome, o código e a quantidade de horas
    * disponíveis para monitoria.
    * O tempo de casa inicial do professor será zero.
    * A função deve criar um professor adjunto com os dados correspondentes e adicioná-lo à lista de professores.
     */
    fun registrarProfessor(nome: String, sobrenome: String, codigo: Int, horas: Int){
        if (!isProfAdjunto(codigo)){
            sProfAdjunto.add(ProfAdjunto(codigo,nome,sobrenome, LocalDate.now(), horas))
        } else{
            println("$nome $sobrenome já consta registrado como professor adjunto. Código associado: $codigo")
        }
    }
    /* Esta função permite registrar um professor titula.
    * A função recebe como parâmetros o nome do professor, o sobrenome, o código e a especialidade.
    * O tempo de casa inicial do professor será zero.
    * A função deve criar um professor adjunto com os dados correspondentes e adicioná-lo à lista de professores.
     */
    fun registrarProfessor(nome: String, sobrenome: String, codigo: Int, especialidade: String){
        if (!isProfTitular(codigo)){
            sProfTitular.add(ProfTitular(codigo,nome,sobrenome, LocalDate.now(),especialidade))
        } else{
            println("$nome $sobrenome já consta registrado como professor adjunto. Código associado: $codigo")        }
    }
    /*  Esta função permite excluir um professor.
    * O método recebe como parâmetro o código do professor.
    * O método deve utilizar o código do professor para encontrá-lo na lista de professores e eliminá-lo da
    *  lista.
     */
    fun excluirProfessor(codigo: Int){
        if ( (isProfTitular(codigo)||isProfAdjunto(codigo))){
            val titular = excluirProfessorTitular(codigo)
            val adjunto = excluirProfessorAdjunto(codigo)
            println("Registros excluídos")
            titular?.let{
                println ("${it.getNome()}: Cargo: Professor Titular")
            }
            adjunto?.let{
                println ("${it.getNome()}: Cargo: Professor Adjunto")
            }
        } else{
            println("Não foi encontrado professor para o código informado")
        }
    }
    /* Esta função registra um aluno na relação de alunos da escola.
    * O método recebe como parâmetros o nome, o sobrenome e o código do aluno.
    */
    fun matricularAluno(nome: String, sobrenome: String, codigo: Int){
        if (!isAluno(codigo)){
            sAlunos.add(Aluno(codigo,nome,sobrenome))
            //   println("aluno adicionado")
        } else{
             println("Já existe aluno para o código: $codigo")
        }
    }
    /* Esta função registra uma relação entre um Aluno e um Curso, caso existam vagas disponíveis no curso.
    */
    fun matricularAluno(codAluno: Int, codCurso: Int){
        val aluno = getAluno(codAluno)
        aluno?: println("Aluno não encontrado. Repita a operação")
        aluno?.let {
            val curso = getCurso(codCurso)
            curso?:println("Curso não encontrado. Repita a operação")
            curso?.let {
                if (it.getVagasDisponíveis() > 0) {
//                    println("Vagas Disponíveis: ${it.getVagasDisponíveis()}")
                    lMatriculas.add(Matricula(aluno, curso))
                    curso.adicionarAluno(aluno)
                    println("Matricula realizada com sucesso: " +
                            "Aluno: ${aluno.getNome()} ${aluno.getSobrenome()}")
//                    println("Curso: ${curso.getNomeCurso()}")
//                    println("Vagas Disponíveis: ${it.getVagasDisponíveis()}")
                } else{
                    println("Não há vagas disponíveis para o curso ${curso.getNomeCurso()}")
                }

            }
        }
    }
    /* Esta função permita alocar professores a um curso.
    * O método recebe como parâmetros o código do curso,o código do professor titular e
    * o código do professor adjunto.
     */
    fun alocarProfessores(codCurso: Int,codProfT: Int, codProfA: Int ){
        val curso = getCurso(codCurso)
        curso?:println("Curso não encontrado. Repita a operação")
        curso?.let{
            val profTit = getProfTitular(codProfT)
            profTit?:println("Professor Titular não encontrado")
            profTit?.let {
                curso.associarProfessor(profTit)
            }
            val profAdj = getProfAdjunto(codProfA)
            profAdj?:println("Professor Adjunto não encontrado")
            profAdj?.let {
                curso.associarProfessor(profAdj)
            }
        }
    }

    /* Função auxiliar para excluir professor Adjunto
* O parâmetro código é chave de busca do professor a ser removido.
* A função retorna o objeto que foi excluído da da relação ou null caso o professor não esteja
* nesta relação.
 */
    private fun excluirProfessorAdjunto(codigo: Int):ProfAdjunto?{
        var professor: ProfAdjunto? = null
        sProfAdjunto.forEach {
            if(it.getCodigo() == codigo){
                professor = it
            }
        }
        professor?.let{
            sProfAdjunto.remove(it)
            return it
        }
        return null
    }
    /* Função auxiliar para excluir professor Titular
    * O parâmetro código é chave de busca do professor a ser removido.
    * A função retorna o objeto que foi excluído da da relação ou null caso o professor não esteja
    * nesta relação.
    */
    private fun excluirProfessorTitular(codigo: Int):ProfTitular?{
        var professor: ProfTitular? = null
        sProfTitular.forEach {
            if(it.getCodigo() == codigo){
                professor = it
            }
        }
        professor?.let{
            sProfTitular.remove(it)
            return it
        }
        return null
    }

    fun getCursos() = sCursos
    fun getAlunos() = sAlunos
    fun getProfsTitular() = sProfTitular
    fun getProfsAdjunto() = sProfAdjunto
    fun getMatriculas() = lMatriculas
    fun hasCurso(codigo: Int):Boolean{
        sCursos.forEach {
            if (it.getCodigoCurso() == codigo) {
                println("Cod curso:${it.getCodigoCurso()} codigo: $codigo ")
                return true
            }
        }
        return false
    }
    fun getCurso(codigo: Int):Curso?{
        sCursos.forEach {
            if (it.getCodigoCurso() == codigo) {
//                println("Cod curso:${it.getCodigoCurso()} codigo: $codigo ")
                return it
            }
        }
        return null
    }
    fun isProfTitular(codigo: Int): Boolean{
        sProfTitular.forEach {
            if (it.getCodigo() == codigo) {
//                println("Cod profTitular::${it.getCodigo()} codigo: $codigo ")
                return true
            }
        }
        return false
    }
    fun getProfTitular(codigo: Int):ProfTitular?{
        sProfTitular.forEach {
            if (it.getCodigo() == codigo) {
//                println("Cod profTitular::${it.getCodigo()} codigo: $codigo ")
                return it
            }
        }
        return null
    }
    fun getProfAdjunto(codigo: Int):ProfAdjunto?{
        sProfAdjunto.forEach {
            if (it.getCodigo() == codigo) {
//                println("Cod profAdjunto::${it.getCodigo()} codigo: $codigo ")
                return it
            }
        }
        return null
    }
    fun isProfAdjunto(codigo: Int): Boolean{
        sProfAdjunto.forEach {
            if (it.getCodigo() == codigo) {
                println("Cod profTitular::${it.getCodigo()} codigo: $codigo ")
                return true
            }
        }
        return false
    }
    fun isAluno(codigo: Int): Boolean{
        sAlunos.forEach {
            if (it.getCodigo() == codigo) {
//                println("Cod aluno:${it.getCodigo()} codigo: $codigo ")
                return true
            }
        }
        return false
    }
    fun getAluno(codigo: Int):Aluno?{
        sAlunos.forEach {
            if (it.getCodigo() == codigo) {
//                println("Cod aluno:${it.getCodigo()} codigo: $codigo ")
                return it
            }
        }
        return null
    }

}