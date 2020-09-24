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
    fun consultarLivro(titulo: String): Boolean{
        livros.forEach {
            if (it.value.tituloLivro.equals(titulo) && it.value.disponibilidade.equals("Disponível")) {
                        return true
                    }
        }
        return false
    }
    fun consultarLivro(codigoLivro:Int): Boolean{
        livros.forEach {
            if (it.value.codigoLivro.equals(codigoLivro) && it.value.disponibilidade.equals("Disponível")) {

                return true
            }
        }
        return false
    }
    fun consultarColecao(titulo: String): Boolean{
        colecoes.forEach {
            if (it.value.titulo.equals(titulo) && it.value.disponibilidade.equals("Disponível")) {
                return true
            }
        }
        return false
    }
    fun consultarColecao(codigoColecao: Int):Boolean{
        colecoes.forEach {
            if (it.value.codigoColecao.equals(codigoColecao) && it.value.disponibilidade.equals("Disponível")) {
                return true
            }
        }
        return false
    }
    fun alugarLivro(livro: Livro, cliente: Cliente){
        if (consultarLivro(livro.codigoLivro)){
            livros.get(livro.codigoLivro)?.setStatusLivro("Alugado")
            cliente.registraLivrosAlugados(livro)
        } else{
            println("Livro não disponível para locação)")
        }
    }
    fun alugarColecao(colecao: Colecao, cliente: Cliente){
        if (consultarColecao(colecao.codigoColecao)){
            colecoes.get(colecao.codigoColecao)?.setStatusColecao("Alugado")
            cliente.registraColecoesAlugadas(colecao)
        } else{
            println("Livro não disponível para locação)")
        }
    }

    fun efetuarVenda(codigoLivro: Int){
        TODO()
    }

    fun verificarEstoque(){
        TODO()
    }



}
