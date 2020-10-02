package desafioIntegrador01

import java.time.LocalDate

class DigitalHouseManager {
    private var sAlunos = mutableSetOf<Aluno>()
    private var sProfTitular = mutableSetOf<ProfTitular>()
    private var sProfAdjunto = mutableSetOf<ProfAdjunto>()
    private var sCursos = mutableSetOf<Curso>()
    private var lMatriculas = mutableListOf<Matricula>()

    /* Esta função permite registrar um curso.
    * O método recebe como parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos.
    * O método deve criar um curso com os dados correspondentes e adicioná-lo à lista de cursos.
     */
    fun registrarCurso(nome: String, codigoCurso: Int, qtdVagas: Int){
        getCurso(codigoCurso)?.let {
            println("O curso $codigoCurso - $nome já existe no catálogo")
        }

        getCurso(codigoCurso)?:sCursos.add(Curso(nome, codigoCurso,qtdVagas))
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
        getProfAdjunto(codigo)?.let{
            println("$nome $sobrenome já consta registrado como professor adjunto. Código associado: $codigo")
        }
        getProfAdjunto(codigo)?:sProfAdjunto.add(ProfAdjunto(codigo,nome,sobrenome, LocalDate.now(),horas))
    }
    /* Esta função permite registrar um professor titula.
    * A função recebe como parâmetros o nome do professor, o sobrenome, o código e a especialidade.
    * O tempo de casa inicial do professor será zero.
    * A função deve criar um professor adjunto com os dados correspondentes e adicioná-lo à lista de professores.
     */
    fun registrarProfessor(nome: String, sobrenome: String, codigo: Int, especialidade: String){
        getProfTitular(codigo)?.let{
            println("$nome $sobrenome já consta registrado como professor titular. Código associado: $codigo")
        }
        getProfTitular(codigo)?:sProfTitular.add(ProfTitular(codigo,nome,sobrenome, LocalDate.now(),especialidade))
    }
    /*  Esta função permite excluir um professor.
    * O método recebe como parâmetro o código do professor.
    * O método deve utilizar o código do professor para encontrá-lo na lista de professores e eliminá-lo da
    *  lista.
     */
    fun excluirProfessor(codigo: Int){
        getProfTitular(codigo)?:getProfAdjunto(codigo)?: println("Professor não encontrado")
        getProfTitular(codigo)?.let{
            sProfTitular.remove(it)
        }
        getProfAdjunto(codigo)?.let {
            sProfAdjunto.remove(it)
        }
    }
    /* Esta função registra um aluno na relação de alunos da escola.
    * O método recebe como parâmetros o nome, o sobrenome e o código do aluno.
    */
    fun matricularAluno(nome: String, sobrenome: String, codigo: Int){
        getAluno(codigo)?.let {
            println("Já existe aluno para o código: $codigo")
        }
        getAluno(codigo)?:sAlunos.add(Aluno(codigo,nome,sobrenome))
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

    /* Funções Auxiliares*/
    fun getCursos() = sCursos
    fun getAlunos() = sAlunos
    fun getProfsTitular() = sProfTitular
    fun getProfsAdjunto() = sProfAdjunto
    fun getMatriculas() = lMatriculas
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
    fun getCurso(codigo: Int):Curso?{
        sCursos.forEach {
            if (it.getCodigoCurso() == codigo) {
//                println("Cod curso:${it.getCodigoCurso()} codigo: $codigo ")
                return it
            }
        }
        return null
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