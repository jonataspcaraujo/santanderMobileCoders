package aula11_exercicioIntegrador

fun main(){

    val livro1 = Livro(1, "Livro1", "AA", 2020, 50.0,1.99)
    val livraria = Livraria("Livraria", "23/09/2020")

    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro1)

}

