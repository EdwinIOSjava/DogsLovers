package com.example.dogsloversapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.dogsloversapp.R
import com.example.dogsloversapp.data.BreedsList
import com.example.dogsloversapp.databinding.ActivityMainBinding
import com.example.dogsloversapp.service.RetrofitInstance
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding// creamos la variable binding de tipo ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        // Inflar el layout usando View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)// aqui inicializamos el binding
        setContentView(binding.root)// aqui le decimos que usemos el binding.root

        //setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        initListeners()
        fetchDogs()

    }

    private fun initListeners() {
        binding.signInButton.setOnClickListener {
            navigateSignInView()
        }
        binding.signUpButton.setOnClickListener {
            navigateSignUpView()
        }
    }

    fun navigateSignInView() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }

    fun navigateSignUpView() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun fetchDogs() {
        lifecycleScope.launch {
            try {
                // Obtener todas las razas y subrazas
                /*val response = RetrofitInstance.api.getBreeds()
                for (breed in response.message.keys) {
                    println(breed)
                    println("Subrazas: ${response.message[breed]}")
                }*/

                // Obtener lista de imagenes de una raza
                /*val response = RetrofitInstance.api.getBreedImages("terrier")
                for (image in response.message) {
                    println(image)
                }*/

                // Obtener imagen aleatoria de una raza
                val response = RetrofitInstance.api.getBreedRandomImage("terrier")
                println(response.message)
                Log.d("RETROFIT",response.toString())// imprime la respuesta en el logcat
            } catch (e: Exception) {
                Log.e("RETROFIT", "Error en la llamada a la API: ",e)
            }
        }
    }

}