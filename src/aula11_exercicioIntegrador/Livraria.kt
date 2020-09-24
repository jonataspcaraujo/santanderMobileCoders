package aula11_exercicioIntegrador

class Livraria(var nomeLivraria: String, var dataFundacao: String) {
    var livros = mutableMapOf<Int,Livro>()
    var colecoes = mutableMapOf<Int,Colecao>()

    fun cadastrarLivro(livro:Livro){
        livros.containsKey(livro.codigoLivro).let({
            livros.put(livro.codigoLivro, livro)
            println("Livros Atualizados")
            livros.forEach({
                println("${it.value.codigoLivro} - ${it.value.tituloLivro}")
            })
        })
    }
    fun cadastrarColecao(colecao: Colecao){
        colecoes.containsKey(colecao.codigoColecao).let({
            colecoes.put(colecao.codigoColecao,colecao)
            println("Coleções Atualizadas")
            colecoes.forEach({
                println("${it.value.codigoColecao} - ${it.value.titulo}")
            })

        })



    }
    fun consultarLivro(titulo: String){

    }
    fun consultarLivro(codigoLivro:Int){
        TODO()
    }
    fun consultarColecao(titulo: String){
        TODO()
    }
    fun consultarColecao(codigoColecao: Int){
        TODO()
    }
    fun alugarLivro(livro: Livro){
        livro.statusLivro = "Alugado"
    }
    fun alugarColecao(colecao: Colecao){
       TODO()
    }
    fun efetuarVenda(codigo: Int){
        TODO()
    }



}