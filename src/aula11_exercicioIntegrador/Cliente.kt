package aula11_exercicioIntegrador

class Cliente(nome: String, rg: Int):Pessoa(nome, rg) {
    var historicoAlugueisLivros = mutableListOf<Livro>()
    var historicoAlugueisColecoes = mutableListOf<Colecao>()
    var historicoCompras = mutableSetOf<Livro>()

    fun registraLivrosAlugados(livro: Livro){
        historicoAlugueisLivros.add(livro)
        println("Historico de alugueis")
        historicoAlugueisLivros.forEach {
            println(it.tituloLivro)
        }
    }
    fun registraColecoesAlugadas(colecao: Colecao){
        historicoAlugueisColecoes.add(colecao)
        println("Historico de alugueis - Colecoes")
        historicoAlugueisColecoes.forEach {
            println(it.titulo)
        }
    }

}