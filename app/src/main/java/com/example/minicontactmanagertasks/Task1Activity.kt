package com.example.minicontactmanagertasks

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnMainActivity = findViewById<Button>(R.id.btnBackMainActivity)
        btnMainActivity.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val btnShare = findViewById<Button>(R.id.btnShare)
        btnShare.setOnClickListener {
            val message = findViewById<TextView>(R.id.etMessage)
            if (message.text.isBlank()||message.text.isNullOrEmpty()) {
                Toast.makeText(this, "Message is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, message.text)
                type = "text/plain"
            }

            val chooser = Intent.createChooser(sendIntent, "Share message via")
            startActivity(chooser)

        }

        Log.d("onCreate","onCreate status reached")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","onStart status reached")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","onStop status reached")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","onResume status reached")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","onDestroy status reached")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","onPause status reached")
    }
}