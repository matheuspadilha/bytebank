package br.com.matheuspadilha.bytebank.modelo

import br.com.matheuspadilha.bytebank.exception.FalhaAutenticacaoException
import br.com.matheuspadilha.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun depositar(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, destino: Conta, senha: Int) {
        if (this.saldo < valor)
            throw SaldoInsuficienteException()

        if (!autenticar(senha))
            throw FalhaAutenticacaoException()

        this.saldo -= valor
        destino.depositar(valor)
    }

    override fun autenticar(senha: Int): Boolean {
        return titular.autenticar(senha)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) this.saldo -= valorComTaxa
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor) this.saldo - valor
    }
}