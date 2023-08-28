package br.com.matheuspadilha.bytebank

fun main(args: Array<String>) {
    testTipoFuncaoReferencia()
    testTipoFuncaoClass()
    testTipoFuncaoLambda()
    testTipoFuncaoAnonima()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun testTipoFuncaoLambda() {
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como Lambda")
    }
    println(minhaFuncaoLambda())
}

fun testTipoFuncaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como Anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testTipoFuncaoClass() {
    val minhaFuncaoClass: () -> Unit = Test()
    println(minhaFuncaoClass())
}

fun testTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::test
    println(minhaFuncao()) // Seguira o padrão lazzy so ira executar quando for obrigado a executar
}

fun test() {
    println("Executa teste")
}

class Test : () -> Unit {
    override fun invoke() {
        println("Executa invoke do Test")
    }

}