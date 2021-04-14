package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Alex Felipe", Toast.LENGTH_SHORT).show()
    }

}