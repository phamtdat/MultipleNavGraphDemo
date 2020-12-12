package com.example.multiplenavgraphdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    private lateinit var navigationController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appBarConfiguration = AppBarConfiguration(emptySet())
        navigationController = findNavController(R.id.mainHostFragment)
        NavigationUI.setupActionBarWithNavController(
            this,
            navigationController,
            appBarConfiguration
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        val navigatedUp = navigationController.navigateUp()
        // enable navigation back to UserActivity
        if (!navigatedUp) onBackPressed()
        return true
    }
}