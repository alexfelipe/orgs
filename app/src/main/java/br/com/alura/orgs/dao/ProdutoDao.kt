package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto

class ProdutoDao {

    private val produtos = mutableListOf<Produto>()

    fun salva(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> = produtos

}