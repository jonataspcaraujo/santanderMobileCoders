package aula11_exercicioIntegrador

class Colecao(var codigoColecao: Int,
              var titulo: String,
              var obras: MutableSet<Livro>,
              var precoVenda: Double,
              var precoAluguel: Double) {
    var disponibilidade: String

    init{
        disponibilidade = "Disponível"
    }
    fun setStatusColecao(statusColecao: String){
        this.disponibilidade = statusColecao
    }

}