package br.com.matheuspadilha.bytebank.teste

import br.com.matheuspadilha.bytebank.modelo.Cliente
import br.com.matheuspadilha.bytebank.modelo.ContaCorrente
import br.com.matheuspadilha.bytebank.modelo.ContaPoupanca

fun testCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("Joao", "111.111.111-11", 1234)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca( Cliente(
        "Maria",
        "222.222.222-22",
        4321
    ), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}