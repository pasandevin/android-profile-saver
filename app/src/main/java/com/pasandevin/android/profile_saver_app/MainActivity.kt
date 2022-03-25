package com.pasandevin.android.profile_saver_app


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.pasandevin.android.profile_saver_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerbutton.setOnClickListener { view ->
            this.goToSecondActivity()
        }

        binding.textPersonName.setOnClickListener {
            binding.textPersonName.text = null
        }

        binding.textemail.setOnClickListener {
            binding.textemail.text = null
        }

        binding.textphone.setOnClickListener {
            binding.textphone.text = null
        }


    }

    fun goToSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}