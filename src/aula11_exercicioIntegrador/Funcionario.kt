package aula11_exercicioIntegrador

class Funcionario(nome: String, rg:Int):Pessoa(nome, rg) {
    var historicoAlugueis = mutableListOf<Livro>()
    var historicoVendas = mutableListOf<Livro>()
}