package br.com.alura.orgs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.orgs.databinding.ActivityListaProdutosBinding
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class ListaProdutosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListaProdutosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "Arroz",
                    "Arroz temperado",
                    BigDecimal("19.99")
                ),
                Produto(
                    nome = "Feijão",
                    "Feijão tradicional",
                    BigDecimal("9.99")
                ),
            )
        )

        binding.floatingActionButton.setOnClickListener {

        }


    }

}