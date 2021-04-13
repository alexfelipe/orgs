package br.com.alura.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alura.orgs.dao.ProdutoDAO
import br.com.alura.orgs.databinding.ActivityFormularioProdutoBinding
import br.com.alura.orgs.model.Produto
import java.lang.NumberFormatException
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFormularioProdutoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularioProdutoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        binding.botao.setOnClickListener {
            val produto = criaProduto()
            ProdutoDAO().salva(produto)
            finish()
        }
    }

    private fun criaProduto(): Produto {
        val nome = binding.nome.text.toString()
        val descricao = binding.descricao.text.toString()
        val valor = try {
            BigDecimal(binding.valor.text.toString())
        } catch (e: NumberFormatException) {
            BigDecimal.ZERO
        }

        return Produto(
            nome = nome,
            descricao = descricao,
            valor = valor
        )
    }

}