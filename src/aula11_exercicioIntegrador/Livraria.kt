package aula11_exercicioIntegrador

class Livraria(var nomeLivraria: String, var dataFundacao: String) {
    var acervo = mutableMapOf<Int,Livro>()
    var colecoes = mutableSetOf<MutableSet<Livro>>()

    fun cadastrarLivro(livro:Livro){
        acervo.containsKey(livro.codigoLivro).let({
            acervo.put(livro.codigoLivro, livro)

            println("Acervo Atualizado")
            acervo.forEach({
                println("${it.value.codigoLivro} - ${it.value.tituloLivro}")
            })
        })


    }
    fun cadastrarColecao(nomeColecao:String, colecao: MutableSet<Livro>){
        TODO()
    }
    fun consultarLivro(titulo: String){
        TODO()
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