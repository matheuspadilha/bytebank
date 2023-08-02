package br.com.matheuspadilha.bytebank.teste

import br.com.matheuspadilha.bytebank.modelo.*

fun testObjects() {
    val maya = object : Autenticavel {
        val nome: String = "Maya"
        val cpf: String = "000.000.000-00"
        val senha: Int = 1000


        override fun autenticar(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(maya, 1000)
    println("nome do cliente ${maya.nome}")

    val matheus = Cliente(nome = "Matheus", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = matheus, numero = 1000)
    val contaCorrente = ContaCorrente(titular = matheus, numero = 1001)

    println("Total de contas: ${Conta.total}")
}