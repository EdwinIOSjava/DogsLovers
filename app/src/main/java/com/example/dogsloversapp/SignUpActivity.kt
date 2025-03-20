package com.example.dogsloversapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dogsloversapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySignUpBinding.inflate(layoutInflater)// aqui inicializamos el binding
        setContentView(binding.root)// aqui le decimos que usemos el binding.root

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initListeners()

    }
    private fun initListeners() {
        binding.floatingActionButton.setOnClickListener {
            navigateOptionsActivityView()
        }
    }

    fun navigateOptionsActivityView(){
        val intent = Intent(this, OptionsActivity::class.java)
        startActivity(intent)
    }
}