package br.com.matheuspadilha.bytebank.teste

import br.com.matheuspadilha.bytebank.modelo.Cliente
import br.com.matheuspadilha.bytebank.modelo.ContaCorrente
import br.com.matheuspadilha.bytebank.modelo.ContaPoupanca

fun testComportamentosConta() {

    val matheus = Cliente("Matheus", "111.111.111-11", 1234)
    val contaMatheus = ContaCorrente(titular = matheus, numero = 1000)
    contaMatheus.depositar(200.0)

    val maya = Cliente("Maya", "222.222.222-22", 4321)
    val contaMaya = ContaPoupanca(numero = 1001, titular = maya)
    contaMaya.depositar(300.0)

    println(contaMaya.titular)
    println(contaMaya.numero)
    println(contaMaya.saldo)

    println(contaMatheus.titular)
    println(contaMatheus.numero)
    println(contaMatheus.saldo)

    println("depositando na conta do Matheus")
    contaMatheus.depositar(50.0)
    println(contaMatheus.saldo)

    println("depositando na conta da Maya")
    contaMaya.depositar(70.0)
    println(contaMaya.saldo)

    println("sacando na conta do Matheus")
    contaMatheus.sacar(250.0)
    println(contaMatheus.saldo)

    println("sacando na conta da Maya")
    contaMaya.sacar(100.0)
    println(contaMaya.saldo)

    println("saque em excesso na conta do Matheus")
    contaMatheus.sacar(100.0)
    println(contaMatheus.saldo)

    println("saque em excesso na conta da Maya")
    contaMaya.sacar(500.0)
    println(contaMaya.saldo)

    println("Transferência da conta da Maya para o Matheus")

    if (contaMaya.transferir(destino = contaMatheus, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaMatheus.saldo)
    println(contaMaya.saldo)
}