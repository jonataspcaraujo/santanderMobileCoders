package desafioIntegrador01

class ProfTitular(codigo: Int = -1, nome: String? = null, sobrenome: String? = null,
                  private var especialidade: String? = null): Professor(codigo,nome,sobrenome) {

    init {
        especialidade?: verificaEspecialidae()
    }
    private fun verificaEspecialidae(){
        print ("Especialidade: ")
            setEspecialidade(readLine().toString())


    }
    private fun setEspecialidade(valor: String){
        this.especialidade = valor
    }
    fun getEspecialidade() = this.especialidade


}