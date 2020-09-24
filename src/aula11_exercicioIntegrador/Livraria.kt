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
    fun alugarLivro(livro: Livro, cliente: Cliente, funcionario: Funcionario){
        if (consultarLivro(livro.codigoLivro)){
            livros.get(livro.codigoLivro)?.setStatusLivro("Alugado")
            cliente.registraLivrosAlugados(livro)
            funcionario.registraAluguel(livro)
        } else{
            println("Livro não disponível para locação)")
        }
    }
    fun alugarColecao(colecao: Colecao, cliente: Cliente, funcionario: Funcionario){
        if (consultarColecao(colecao.codigoColecao)){
            colecoes.get(colecao.codigoColecao)?.setStatusColecao("Alugado")
            cliente.registraColecoesAlugadas(colecao)
            funcionario.registraAluguel(colecao)
        } else{
            println("Livro não disponível para locação)")
        }
    }

    fun efetuarVenda(codigo: Int, cliente:Cliente, funcionario: Funcionario){
        if (consultarLivro(codigo)){
//            println("Vendendo livros")
            livros.get(codigo)?.setStatusLivro("Vendido")
           cliente.registraLivrosComprados(livros.get(codigo))
            livros.get(codigo)?.let { funcionario.registraVenda(it) }
        } else if (consultarColecao(codigo)) {
//            println("Vendendo colecoes")
            colecoes.get(codigo)?.setStatusColecao("Vendido")
            cliente.registraColecoesCompradas(colecoes.get(codigo))
            colecoes.get(codigo)?.let { funcionario.registraVenda(it) }
        } else{
            println("Itens não disponíveis para vendaS")
        }


    }

    fun verificarEstoque(){
        TODO()
    }



}
