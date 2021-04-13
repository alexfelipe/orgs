package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto

class ProdutoDAO {

    val produtos get() = Companion.produtos.toList()

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

    fun salva(produto: Produto) {
        Companion.produtos.add(produto)
    }

}