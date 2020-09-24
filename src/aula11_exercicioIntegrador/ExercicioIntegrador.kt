package aula11_exercicioIntegrador

fun main(){
    val livraria = Livraria("Livraria", "23/09/2020")

    val livro1 = Livro(11, "Livro1", "AA", 2020, 50.0,1.99)
    val livro2 = Livro(12, "Livro2", "AA", 2019, 40.0,0.99)
    val livro3 = Livro(13, "Livro3", "BB", 2020, 50.0,1.99)
    val livro9 = Livro(19, "Livro9", "AA", 2020, 50.0,1.99)
    val livro8 = Livro(18, "Livro8", "AA", 2019, 40.0,0.99)
    val livro7 = Livro(17, "Livro7", "BB", 2020, 50.0,1.99)
    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro2)
    livraria.cadastrarLivro(livro3)
    livraria.cadastrarLivro(livro9)
    livraria.cadastrarLivro(livro8)
    livraria.cadastrarLivro(livro7)

//    val colecao1 = Colecao(21,"Livros 2020", mutableSetOf(livro9,livro7),89.90,0.99)
//    val colecao2 = Colecao(22,"Livros do autor AA", mutableSetOf(livro9,livro8), 59.90, 0.99)
//    livraria.cadastrarColecao(colecao1)
//    livraria.cadastrarColecao(colecao2)

//    println("Consulta Título Livro1: ${livraria.consultarLivro("Livro1")}")
//    println("Consulta Título Livro4: ${livraria.consultarLivro("Livro4")}")
//    println("Consulta Código Livro 1: ${livraria.consultarLivro(11)}")
//    println("Consulta Código Livro 4: ${livraria.consultarLivro(14)}")

//    println("Consulta Título Coleção 'Livros 2020': ${livraria.consultarColecao("Livros 2020")}")
//    println("Consulta Título Coleção '2020': ${livraria.consultarColecao("2020")}")
//    println("Consulta Código Coleção 1: ${livraria.consultarColecao(21)}")
//    println("Consulta Código Coleção 4: ${livraria.consultarColecao(24)}")

    val cliente = Cliente("Jonatas", 123456)
    val funcionario = Funcionario ("Araujo", 78945)
    livraria.alugarLivro(livro1,cliente, funcionario)
    livraria.alugarLivro(livro2,cliente, funcionario)
//    livraria.alugarColecao(colecao1,cliente,funcionario)

    livraria.efetuarVenda(18,cliente,funcionario)
    livraria.efetuarVenda(13,cliente,funcionario)
//    livraria.efetuarVenda(22,cliente,funcionario)
//    println("Consulta Código Coleção 1: ${livraria.consultarColecao(22)}")
    funcionario.listarVendas()
//    funcionario.listarAlugueis()
//    cliente.listarCompras()
//    cliente.listarAlugueis()
    livraria.verificarEstoque()
}

