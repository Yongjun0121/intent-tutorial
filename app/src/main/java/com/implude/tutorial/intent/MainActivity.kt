
package com.implude.tutorial.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_open=findViewById<Button>(R.id.button)

        btn_open.setOnClickListener{
            val it = (Intent(this, AnotherActivity::class.java))
            startActivity(it)
        }
    }

}