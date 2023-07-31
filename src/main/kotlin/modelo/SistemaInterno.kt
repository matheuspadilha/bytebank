package modelo

class SistemaInterno {
    fun entrar(admin: Autenticavel, senha: Int) {
        if (admin.autenticar(senha))
            println("Bem vindo ao Bytebank")
        else
            println("Falha na autenticação")
    }
}