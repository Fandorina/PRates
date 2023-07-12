package com.first.prates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingsButton = findViewById<Button>(R.id.changeButton)
        val mainCircleFirstButton = findViewById<Button>(R.id.mainChooseCurButtonFirst)

        settingsButton.setOnClickListener {
            val changeButtonIntent = Intent(this, CurrencySettings::class.java)
            startActivity(changeButtonIntent)
        }

        mainCircleFirstButton.setOnClickListener {
            val mainCircleFirstButtonIntent = Intent(this, ChooseCurrencySearch::class.java)
            startActivity(mainCircleFirstButtonIntent)
        }
    }
}