package desafioIntegrador01

import java.time.LocalDate
/*
* Classe que representa professor titular.
 */
class ProfTitular(codigo: Int = -1,
                  nome: String? = null,
                  sobrenome: String? = null,
                  dataContratacao: LocalDate? = null,
                  private var especialidade: String? = null):
        Professor(codigo,nome,sobrenome, dataContratacao) {

    /* Inicia o objeto e verifica se a especialidade foi informada.
    * Caso a especialidade seja null, é solicitado que o usuário a informe, via linha de comando.
    * Demais parâmentros do construr são verificados nas classes Professor e Pessoa.
     */
    init {
        especialidade?: verificaEspecialidae()
    }
    private fun verificaEspecialidae(){
        print ("Informe a especialidade: ")
        this.especialidade = readLine().toString()
    }
    fun getEspecialidade() = this.especialidade
}