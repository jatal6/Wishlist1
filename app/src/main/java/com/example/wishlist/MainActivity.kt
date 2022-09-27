package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemName = findViewById<EditText>(R.id.inputText)
        val urlname = findViewById<EditText>(R.id.inputText3)
        val itemprice = findViewById<EditText>(R.id.inputText2)

        val button = findViewById<Button>(R.id.button)
        var x = ""
        var y = ""
        var z = ""

        button.setOnClickListener {
            Toast.makeText(it.context, "Data Submitted!", Toast.LENGTH_SHORT).show()



        }
    }
}