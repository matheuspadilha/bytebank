package br.com.matheuspadilha.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}