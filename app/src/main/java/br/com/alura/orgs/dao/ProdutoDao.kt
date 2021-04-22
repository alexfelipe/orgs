package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto

class ProdutoDao {

    fun salva(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> = produtos

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

}