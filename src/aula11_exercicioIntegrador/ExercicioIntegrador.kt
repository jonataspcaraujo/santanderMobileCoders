package aula11_exercicioIntegrador

fun main(){
    val livraria = Livraria("Livraria", "23/09/2020")

    val livro1 = Livro(1, "Livro1", "AA", 2020, 50.0,1.99)
    val livro2 = Livro(2, "Livro2", "AA", 2019, 40.0,0.99)
    val livro3 = Livro(3, "Livro3", "BB", 2020, 50.0,1.99)
    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro2)
    livraria.cadastrarLivro(livro3)

    val colecao1 = Colecao(1,"Livros 2020", mutableSetOf(livro1,livro3),89.90,0.99)
    val colecao2 = Colecao(2,"Livros do autor AA", mutableSetOf(livro1,livro2), 59.90, 0.99)
//  livraria.cadastrarColecao(colecao1)
//  livraria.cadastrarColecao(colecao2)

    println("Consulta Título Livro1: ${livraria.consultarLivro("Livro1")}")
    println("Consulta Título Livro4: ${livraria.consultarLivro("Livro4")}")
    println("Consulta Código Livro 1: ${livraria.consultarLivro(1)}")
    println("Consulta Código Livro 4: ${livraria.consultarLivro(4)}")


}

