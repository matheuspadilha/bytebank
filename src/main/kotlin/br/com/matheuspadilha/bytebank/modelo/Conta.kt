package br.com.matheuspadilha.bytebank.modelo

abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun depositar(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.depositar(valor)
            return true
        }

        return false
    }
}