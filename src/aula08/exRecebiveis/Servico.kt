package aula08.exRecebiveis

class Servico(private var descricao: String,
              private var horas: Int,
              private var precoHora: Double):IRecebivel  {
    override fun totalizarReceita(): Double {
        TODO("Not yet implemented")
    }
    override fun toString(): String{
        return descricao +" preço/horas: "+ precoHora.toString() + " "+ horas.toString()
    }
}