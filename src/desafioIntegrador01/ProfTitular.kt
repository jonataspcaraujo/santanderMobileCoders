package desafioIntegrador01

class ProfTitular(private var especialidade: String? = null):Professor() {

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