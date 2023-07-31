package br.com.matheuspadilha.bytebank.modelo

interface Autenticavel {
    fun autenticar(senha: Int): Boolean
}