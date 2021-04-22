package br.com.alura.orgs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.orgs.dao.ProdutoDao
import br.com.alura.orgs.databinding.ActivityFormularioProdutoBinding
import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormularioProdutoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        binding.botaoSalvar.setOnClickListener {
            val produtoNovo = criaProduto()
            salva(produtoNovo)
            finish()
        }
    }

    private fun criaProduto(): Produto {
        val nome = binding.nome.text.toString()
        val descricao = binding.descricao.text.toString()
        val valor = binding.valor.text.toString()
        return Produto(
            nome = nome,
            descricao = descricao,
            valor = BigDecimal(valor)
        )
    }

    private fun salva(produtoNovo: Produto) {
        val dao = ProdutoDao()
        dao.salva(produtoNovo)
    }

}