package com.example.dogsloversapp

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import com.example.dogsloversapp.databinding.ActivityBreedGeneratorBinding
import com.example.dogsloversapp.databinding.ActivitySignInBinding

class BreedGeneratorActivity : AppCompatActivity() {

    lateinit var binding: ActivityBreedGeneratorBinding// creamos la variable binding de tipo ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityBreedGeneratorBinding.inflate(layoutInflater)// aqui inicializamos el binding
        setContentView(binding.root)// aqui le decimos que usemos el binding.root

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.searchView.editText.addTextChangedListener {
            println("Texto Buscado: ${binding.searchView.editText.text}")
            Log.i("search","${binding.searchView.editText.text}")

        }
    }



}