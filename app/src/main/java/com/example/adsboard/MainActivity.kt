package com.example.adsboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.example.adsboard.databinding.ActivityMainBinding
import com.example.adsboard.databinding.ToolbarBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val toogle = ActionBarDrawerToggle(this, binding.drawerLayout, toolbar, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.myAds -> {

            }
            R.id.car -> {

            }
            R.id.mobPhone -> {

            }
            R.id.comp -> {

            }
            R.id.appliances -> {

            }
            R.id.registr -> {

            }
            R.id.login -> {

            }
            R.id.logout -> {

            }
        }

        binding.drawerLayout.closeDrawers()
        return true
    }

}