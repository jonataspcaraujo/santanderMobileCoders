package aula11_exercicioIntegrador

class Cliente(nome: String, rg: Int):Pessoa(nome, rg) {
    var historicoAlugueisLivros = mutableListOf<Livro>()
    var historicoAlugueisColecoes = mutableListOf<Colecao>()
    var historicoComprasLivros = mutableSetOf<Livro>()
    var historicoComprasColecoes = mutableSetOf<Colecao>()

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
    fun registraLivrosComprados(livro:Livro?){
        livro.let {
            if (livro != null) {
                historicoComprasLivros.add(livro)
                println("Livro adicionado ao histórico de compras")
            }
        }
    }
    fun registraColecoesCompradas(colecao:Colecao?) {
        colecao.let {
            if (colecao != null) {
                historicoComprasColecoes.add(colecao)
                println("Coleção adicionada ao histórico de compras")
            }
        }
    }
    fun listarCompras(){
        println("Historico de compras")
        historicoComprasLivros.forEach {
            println(it.tituloLivro)
        }
        historicoComprasColecoes.forEach {
            println(it.obras.forEach{
                println(it.tituloLivro)
            } )
        }
    }
    fun listarAlugueis(){
        println("Historico de alugueis")
        historicoAlugueisLivros.forEach {
            println(it.tituloLivro)
        }
        historicoAlugueisColecoes.forEach {
            println(it.obras.forEach{
                println(it.tituloLivro)
            } )
        }

    }

}

