package desafioIntegrador01

class ProfTitular(private var especialidade: String? = null):Professor() {

    init {
        especialidade?: {
            print ("Especialidade: ")
            setEspecialidade(readLine().toString())
        }.toString()
        especialidade?.let {
            setEspecialidade(it)
        }
    }
    private fun setEspecialidade(valor: String){
        this.especialidade = valor
    }
    fun getEspecialidade() = this.especialidade


}