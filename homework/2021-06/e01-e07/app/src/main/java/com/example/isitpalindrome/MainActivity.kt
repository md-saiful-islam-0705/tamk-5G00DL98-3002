package com.example.isitpalindrome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate()")

        var b : Button = findViewById(R.id.Button)
        var t : TextView = findViewById(R.id.TextView)
        var editText : EditText? = null

        b.setOnClickListener() {
            t.text ="YES"
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "OnDestroy")
    }


}