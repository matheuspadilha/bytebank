package br.com.matheuspadilha.bytebank.teste

import br.com.matheuspadilha.bytebank.modelo.Endereco

fun testAny() {
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

    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}