package com.example.adsboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.adsboard.databinding.ActivityMainBinding
import com.example.adsboard.databinding.ToolbarBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val toolbar: ToolbarBinding = ToolbarBinding.inflate(layoutInflater)
        val toogle = ActionBarDrawerToggle(this, binding.drawerLayout, toolbar.toolbar, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
    }

}