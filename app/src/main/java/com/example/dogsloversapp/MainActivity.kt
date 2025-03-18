package com.example.dogsloversapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dogsloversapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding// creamos la variable binding de tipo ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)// aqui inicializamos el binding
        setContentView(binding.root)// aqui le decimos que usemos el binding.root

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Log.d("MainActivity", "Binding inicializado correctamente: ${::binding.isInitialized}")
//        Log.d("MainActivity", "signInButton es: ${binding.signInButton}")

        val signInButton = findViewById<Button>(R.id.signInButton)
        signInButton.setOnClickListener {
            Log.d("MainActivity", "Botón SignIn presionado")
            navigateSignInView()
        }

        //initListeners()




        // escuchamos el click en el boton y cambiamos de layout


    }

    private fun initListeners() {
         binding.signInButton?.setOnClickListener {
             Log.d("MainActivity", "SignIn button clicked!")
             navigateSignInView()
         }
        binding.signUpButton.setOnClickListener {
            navigateSignUpView()
        }
    }

    fun navigateSignInView(){
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
    fun navigateSignUpView(){
        val intent = Intent(this, navigateSignUpView()::class.java)
        startActivity(intent)
    }
}