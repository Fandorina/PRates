package com.first.prates

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CurrencySettings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.currency_settings)

        val settingsBackButton = findViewById<Button>(R.id.backButton)
        val settingsMainCurButton = findViewById<Button>(R.id.mainCurButton)

        settingsBackButton.setOnClickListener {
            val settingsBackButtonIntent = Intent(this, MainActivity::class.java)
            startActivity(settingsBackButtonIntent)
        }
        settingsMainCurButton.setOnClickListener {
            val settingsMainCurButtonIntent = Intent(this, CurSetSearch::class.java)
            startActivity(settingsMainCurButtonIntent)
        }

    }
}