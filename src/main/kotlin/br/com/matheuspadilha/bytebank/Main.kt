package br.com.matheuspadilha.bytebank

import br.com.matheuspadilha.bytebank.modelo.Endereco

fun main(args: Array<String>) {
    val endereco = Endereco(
        logradouro = "Rua abc",
        complemento = "Casa",
        cep = "11110-700"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua abc",
        complemento = "Casa",
        cep = "11110-700"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}