/*Exercício 1
A Digital House decidiu desenvolver um sistema de cadastro de alunos com seus
respectivos cursos, professores responsáveis e turmas, para esse sistema foram levantados
os seguintes requisitos:
• A matéria dada em cada aula possui um nome;
• A aula possui uma matéria, um horário de início e término;
• O aluno possui um RA (Registro Acadêmico), nome, sobrenome.
• O aluno pode assistir as aulas e fazer as lições de casa;
• O curso possui um nome, uma lista de aulas, uma lista de alunos e um professor
responsável;
• O professor possui um nome e um RD (Registro Docente);
• O professor por ser um Docente tem a obrigatoriedade de dar aulas e fazer a chamada
dos alunos;
• A turma deverá conter um nome e um curso associado.
*/
package aula08.exSisCadastro
fun main(){
    println("Exercicio")

}
interface IPessoa{
    var registro: String
    var nome: String
}
class Aluno(override var nome: String, private var sobrenome: String, override var registro: String): IPessoa{

    private var aulas: List<Aula> = mutableListOf()
     fun assistirAula(){
        println("Assistindo aula ")
    }
    fun fazerLicaoDeCasa(){
        println("Lição de casa ")
    }
}
class Professor(override var nome: String,
                override var registro: String):IPessoa{

    var alunos: MutableList<String> = mutableListOf()

    fun darAula(aula: Aula){
        println("Aula: ${aula.materia.getMateriaNome()}")
    }
    fun fazerChamada(aluno: Aluno){
        alunos.add(aluno.nome)
    }
}

class Materia{
    private var nome = ""
    fun getMateriaNome(): String{
        return nome
    }
}
class Aula(var materia: Materia, private var horaInicio: String, private var horaFim: String){ }

class Curso {
    private var nomeCurso: String = ""
    private var aulas: MutableList<Aula> =  mutableListOf()
    private var alunos: MutableList<Aluno> = mutableListOf()
    private var professorResponsavel = Professor("", "")
}
class Turma(private var nome: String, private var cursoAssociado: Curso){ }

