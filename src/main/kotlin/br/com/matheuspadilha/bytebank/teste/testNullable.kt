package br.com.matheuspadilha.bytebank.teste

import br.com.matheuspadilha.bytebank.modelo.Endereco

fun testNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}