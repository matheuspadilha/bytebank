package br.com.matheuspadilha.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    private val senha: Int,
    var endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}