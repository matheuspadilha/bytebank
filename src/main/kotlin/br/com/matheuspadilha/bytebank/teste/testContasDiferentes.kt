package br.com.matheuspadilha.bytebank.teste

import br.com.matheuspadilha.bytebank.modelo.Cliente
import br.com.matheuspadilha.bytebank.modelo.ContaCorrente
import br.com.matheuspadilha.bytebank.modelo.ContaPoupanca

fun testContasDiferentes() {

    val matheus = Cliente("Matheus", "111.111.111-11", 1234)
    val contaCorrente = ContaCorrente(
        titular = matheus,
        numero = 1000
    )
    val maya = Cliente("Maya", "222.222.222-22", 4321)
    val contaPoupanca = ContaPoupanca(
        titular = maya,
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca, 1234)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transferir(200.0, contaCorrente, 4321)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}