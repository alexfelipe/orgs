package br.com.alura.orgs

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.alura.orgs.dao.ProdutoDao
import br.com.alura.orgs.databinding.ActivityListaProdutosBinding
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

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
        val dao = ProdutoDao()
        val produtos = dao.buscaTodos()
        Log.i(TAG, "configuraRecyclerView: $produtos")
        recyclerview.adapter = ListaProdutosAdapter(
            this,
            produtos
        )
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

}