package com.example.per7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val THE_MESSAGE = "com.example.per7.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }
    fun sendMessage(view: View) {

        val x = findViewById<EditText>(R.id.et_user)
        val message = x.text.toString()

        val intent = Intent(this, Layout2::class.java).apply {
            putExtra(THE_MESSAGE,message)

        }
        startActivity(intent)
    }
}