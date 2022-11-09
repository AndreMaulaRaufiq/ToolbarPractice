package com.example.toolbarpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        when (item.itemId) {
            R.id.action_addcontact -> Toast.makeText(this, "Add Contact Clicked", Toast.LENGTH_LONG).show()
            R.id.action_favorite -> Toast.makeText(this, "Favorite  Clicked", Toast.LENGTH_LONG).show()
            R.id.action_settings -> Toast.makeText(this, "Setting Clicked", Toast.LENGTH_LONG).show()
            R.id.action_feedback -> Toast.makeText(this, "Feedback Clicked", Toast.LENGTH_LONG).show()
            R.id.action_close -> finish()
        }
        return true
    }
}

