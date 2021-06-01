package com.ajieno.bansostracking.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ajieno.bansostracking.R
import com.ajieno.bansostracking.databinding.ActivityHomeBinding
import com.ajieno.bansostracking.ui.databansos.ListDataBansosActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        binding.cardView4.setOnClickListener {
            val intent = Intent(this, ListDataBansosActivity::class.java)
            startActivity(intent)
        }
    }
}