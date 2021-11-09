package com.example.taller01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onOffline(view: View) {
        val intento = Intent(this, HomeActivity::class.java)
        startActivity(intento)
    }
    fun onOnline(view: View) {
        val  intento = Intent(this, onlineActivity::class.java)
        startActivity(intento)
    }

    fun onLogistic(view: View) {
        val intento = Intent (this, HomeActivity::class.java)
        startActivity(intento)
    }
    fun onBook(view: View) {
        val intento = Intent ( this, HomeActivity::class.java)
        startActivity(intento)
    }
}