package aula08.exRecebiveis

class ItemVenda(private var produto: String,
                private var quantidade: Int,
                private var valor: Double):IRecebivel {

    override fun totalizarReceita(): Double {
        return quantidade*valor
    }

    override fun toString(): String {
        return produto +" "+ quantidade.toString() +" R$ "+ valor.toString()
    }

}