package aula11_exercicioIntegrador

class Cliente(nome: String, rg: Int):Pessoa(nome, rg) {
    var historicoAlugueis = mutableListOf<Livro>()
    var historicoCompras = mutableSetOf<Livro>()

}