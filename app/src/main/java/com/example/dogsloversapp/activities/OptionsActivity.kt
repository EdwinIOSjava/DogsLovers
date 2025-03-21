package com.example.dogsloversapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dogsloversapp.BreedGeneratorActivity
import com.example.dogsloversapp.R
import com.example.dogsloversapp.databinding.ActivityOptionsBinding

class OptionsActivity : AppCompatActivity() {
    lateinit var binding : ActivityOptionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOptionsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponets()

    }
    fun initComponets(){
        binding.searchSpecificBreedButton.setOnClickListener {
            navigateBreedGeneratorView()
        }
        binding.searchRandomBreedButton.setOnClickListener {
            navigateBreedGeneratorView()
        }
    }

    private fun navigateBreedGeneratorView() {
        val intent= Intent(this, BreedGeneratorActivity::class.java)
        startActivity(intent)
    }
}