package com.example.minicontactmanagertasks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnTask1 = findViewById<Button>(R.id.btn_task1)
        btnTask1.setOnClickListener {
            val intent = Intent(this,Task1Activity::class.java)
            startActivity(intent)
        }
        val btnTask2 = findViewById<Button>(R.id.btn_task2)
        btnTask2.setOnClickListener {
            val intent = Intent(this,Task2Activity::class.java)
            startActivity(intent)
        }
        val btnTask3 = findViewById<Button>(R.id.btn_task3)

    }
}