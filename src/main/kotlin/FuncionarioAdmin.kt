abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
), Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}