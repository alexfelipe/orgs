package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.databinding.ActivityListaProdutosBinding
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

private const val TAG = "ListaProdutosActivity"

class ListaProdutosActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityListaProdutosBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraRecyclerView()
    }

    private fun configuraRecyclerView() {
        val recyclerview = binding.recyclerview
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