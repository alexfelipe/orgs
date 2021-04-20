package br.com.alura.orgs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.alura.orgs.dao.ProdutoDao
import br.com.alura.orgs.databinding.ActivityFormularioProdutoBinding
import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

private const val TAG = "FormularioActivity"

class FormularioProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormularioProdutoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.botaoSalvar.setOnClickListener {
            val nome = binding.nome.text.toString()
            val descricao = binding.descricao.text.toString()
            val valor = binding.valor.text.toString()
            val produtoNovo = Produto(
                nome = nome,
                descricao = descricao,
                valor = BigDecimal(valor)
            )
            Log.i(TAG, "onCreate: produto novo criado $produtoNovo")
            val dao = ProdutoDao()
            dao.salva(produtoNovo)
            Log.i(TAG, "onCreate: ${dao.buscaTodos()}")
            finish()
        }
    }

}