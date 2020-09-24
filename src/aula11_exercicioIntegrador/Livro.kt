package aula11_exercicioIntegrador

class Livro(var codigoLivro: Int,
            val tituloLivro: String,
            val autor: String,
            val anoLancamentoLivro: Int,
            var precoVenda: Double,
            var precoAluguelDia: Double) {

    var disponibilidade: String
    init{
        disponibilidade = "Disponível"
   }
    fun setStatusLivro(statusLivro: String){
        this.disponibilidade = statusLivro
    }
}