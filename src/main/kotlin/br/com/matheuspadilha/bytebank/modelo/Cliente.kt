package br.com.matheuspadilha.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}