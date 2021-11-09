package com.example.taller01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class onlineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online)
    }

    fun onMain(view: View) {
        val intento = Intent(this, MainActivity::class.java)
        startActivity(intento)


    }
}