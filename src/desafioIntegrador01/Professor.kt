package desafioIntegrador01

import java.time.LocalDate

class Professor():Pessoa() {

   private var dataContratacao: LocalDate? = null
    init{

        println("Data de contratação (YYYY-MM-DD): ")
        val aux = readLine()
        setDataContratacao(LocalDate.parse(aux))

//        val data2 = LocalDate.parse(aux)
//        println(data2)
////        val data1 = LocalDate.of(2019,9,27)
////        println(data1)
//        val dataNow = LocalDate.now()
//        println(dataNow)
    }

    private fun setDataContratacao(data: LocalDate){
        this.dataContratacao = data
    }
    fun getDataContratacao(): LocalDate?{
        return this.dataContratacao
    }
    fun getTempoDeCasa(): MutableMap<String, Int>{
        val tempoDeCasa = mutableMapOf<String,Int>()
        val anos = LocalDate.now().year - (this.dataContratacao?.year ?:LocalDate.now().year )
        tempoDeCasa.put("ano",anos)
//        println("Diferenca anos: $anos")
        val meses = LocalDate.now().monthValue - (this.dataContratacao?.monthValue ?:LocalDate.now().monthValue )
        tempoDeCasa.put("mes",meses)
//        println("Diferenca meses: $meses")
        val dias = LocalDate.now().dayOfMonth - (this.dataContratacao?.dayOfMonth ?:LocalDate.now().dayOfMonth )
        tempoDeCasa.put("dia",dias)
//        println("Diferenca dia: $dias")
        return tempoDeCasa
    }
}