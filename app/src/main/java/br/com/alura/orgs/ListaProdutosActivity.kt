package br.com.alura.orgs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
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
        binding.fabNovo.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
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