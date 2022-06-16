package com.example.edittextkot2

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1 = findViewById<EditText>(R.id.et)
        et1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, start: Int, before: Int, count: Int) {
                val a: String = et1.text.toString()
                Toast.makeText(this@MainActivity, a, Toast.LENGTH_LONG).show()
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }
}