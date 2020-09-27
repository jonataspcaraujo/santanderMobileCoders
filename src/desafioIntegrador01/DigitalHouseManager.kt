package desafioIntegrador01

class DigitalHouseManager() {
    private var sAlunos = mutableSetOf<Aluno>()
//    private var sProfessores = mutableSetOf<Professor>()
    private var sProfTitular = mutableSetOf<ProfTitular>()
    private var sProfAdjunto = mutableListOf<ProfAdjunto>()
    private var sCursos = mutableSetOf<Curso>()
    private var lMatriculas = mutableListOf<Matricula>()

    init {
        // TODO: 27/09/2020  
    }
    fun registrarCurso(nome: String, codigoCurso: Int, qtdVagas: Int){
        if(sCursos.isEmpty()) {
            sCursos.add(Curso(nome, codigoCurso,qtdVagas))
         //   println("Lista de cursos iniciada")
        } else if (!hasCurso(codigoCurso)){
            sCursos.add(Curso(nome, codigoCurso,qtdVagas))
         //   println("curso adicionado")
        } else{
           // println("curso já existe")
        }
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
    fun registrarProfessor(nome: String, sobrenome: String, codigo: Int, horas: Int){
        if(sProfAdjunto.isEmpty()) {
            sProfAdjunto.add(ProfAdjunto(codigo,nome,sobrenome,horas))
            //   println("Lista de adjuntos iniciada")
        } else if (!isProfAdjunto(codigo)){
            sProfAdjunto.add(ProfAdjunto(codigo,nome,sobrenome,horas))
//            println("adjunto adicionado")
        } else{
            println("Professor Adjunto já cadastrado")
        }
    }
    fun registrarProfessor(nome: String, sobrenome: String, codigo: Int, especialidade: String){
        if(sProfTitular.isEmpty()) {
            sProfTitular.add(ProfTitular(codigo,nome,sobrenome,especialidade))
            //   println("Lista de adjuntos iniciada")
        } else if (!isProfTitular(codigo)){
            sProfTitular.add(ProfTitular(codigo,nome,sobrenome,especialidade))
//            println("titular adicionado")
        } else{
            println("Professor Titular já cadastrado")
        }
    }
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
    private fun excluirProfessorAdjunto(codigo: Int):ProfAdjunto?{
        var professor: ProfAdjunto? = null
        sProfAdjunto.forEach {
            if(it.getCodigo() == codigo){
                professor = it
//                println("Curso a remover: $codigoCurso")
            }
        }
        professor?.let{
            sProfAdjunto.remove(it)
//            println("Curso Removido: ${it.getCodigoCurso()} - ${it.getNomeCurso()}")
            return it
        }
        return null
    }
    private fun excluirProfessorTitular(codigo: Int):ProfTitular?{
        var professor: ProfTitular? = null
        sProfTitular.forEach {
            if(it.getCodigo() == codigo){
                professor = it
//                println("Curso a remover: $codigoCurso")
            }
        }
        professor?.let{
            sProfTitular.remove(it)
//            println("Curso Removido: ${it.getCodigoCurso()} - ${it.getNomeCurso()}")
            return it
        }
        return null
    }
    fun matricularAluno(nome: String, sobrenome: String, codigo: Int){
        if(sAlunos.isEmpty()) {
            sAlunos.add(Aluno(codigo,nome,sobrenome))
            //   println("Lista de alunos iniciada")
        } else if (!isAluno(codigo)){
            sAlunos.add(Aluno(codigo,nome,sobrenome))
            //   println("aluno adicionado")
        } else{
             println("Já existe aluno para o código: $codigo")
        }
    }
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
                    println("Matricula realizada com sucesso:")
                    println("Aluno: ${aluno.getNome()} ${aluno.getSobrenome()}")
                    println("Curso: ${curso.getNomeCurso()}")
//                    println("Vagas Disponíveis: ${it.getVagasDisponíveis()}")
                } else{
                    println("Não há vagas disponíveis para o curso ${curso.getNomeCurso()}")
                }

            }
        }
    }
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