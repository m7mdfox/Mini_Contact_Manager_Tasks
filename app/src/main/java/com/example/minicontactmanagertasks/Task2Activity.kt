package com.example.minicontactmanagertasks

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvName = findViewById<TextView>(R.id.tvName)
        val etNewName = findViewById<EditText>(R.id.etNewName).text
        val btnSave = findViewById<Button>(R.id.btnSave)
        btnSave.setOnClickListener {
            if (etNewName.isNullOrEmpty()||etNewName.isBlank()){
                Toast.makeText(this, "Invalid Name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            tvName.text = etNewName
        }
    }
}