package aula11_exercicioIntegrador

class Colecao(var codigoColecao: Int,
              var titulo: String,
              var obras: MutableSet<Livro>,
              var precoVenda: Double,
              var precoAluguel: Double) {
    init{
        var statuColecao = "Disponível"
    }

}