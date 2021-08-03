package com.example.adsboard

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.adsboard.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.appToolbar.toolbar, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.myAds -> {
                Toast.makeText(this, "My Ads", Toast.LENGTH_SHORT).show()
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
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}