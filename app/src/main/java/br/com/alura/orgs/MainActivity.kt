package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.adapter = ListaProdutosAdapter(
            this,
            listOf(
                Produto(
                    nome = "cesta de frutas",
                    descricao = "laranja, manga e maçã",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "cesta de frutas",
                    descricao = "laranja, manga e maçã",
                    valor = BigDecimal("19.99")
                ),
            )
        )
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

}