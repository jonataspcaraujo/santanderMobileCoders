package aula11_exercicioIntegrador

class Funcionario(nome: String, rg:Int):Pessoa(nome, rg) {
    var historicoAlugueis = mutableListOf<Livro>()
    var historicoVendas = mutableListOf<Livro>()

    fun registraVenda(livro: Livro){
        historicoVendas.add(livro)
    }
    fun registraVenda(colecao: Colecao){
        colecao.obras.forEach {
            historicoVendas.add(it)
        }
    }
    fun listarVendas(){
        println("Historico de vendas")
        historicoVendas.forEach {
            println(it.tituloLivro)
        }
    }
    fun registraAluguel(livro: Livro){
        historicoAlugueis.add(livro)
    }
    fun registraAluguel(colecao: Colecao){
        colecao.obras.forEach {
            historicoAlugueis.add(it)
        }
    }
    fun listarAlugueis(){
        println("Historico de alugueis")
        historicoAlugueis.forEach {
            println(it.tituloLivro)
        }
    }

}