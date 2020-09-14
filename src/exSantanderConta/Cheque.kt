package exSantanderConta

class Cheque (private var valorCheque: Double,
              private var bancoEmissor: String,
              private var dataPg: String) {

    fun getValorCheque():Double{
        return valorCheque
    }
    fun getBancoEmissor():String{
        return bancoEmissor
    }
    fun getDataPagamento():String{
        return dataPg
    }



}