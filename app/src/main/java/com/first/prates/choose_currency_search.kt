package com.first.prates

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ChooseCurrencySearch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_currency_search)

        val chooseCurBackButton = findViewById<Button>(R.id.chooseCurSearchBackButton)
        val moreAboutButton = findViewById<Button>(R.id.moreButton)
        val currencyList = findViewById<ListView>(R.id.ListView)
        val testAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1 , arrayOf<String>("AMD - Армянский драм", "USD - Доллар США", "RUB - Российский рубль", "GEL - Грузинский лари", "JPY - Японская йена", "MXN - Мексиканская пессо"))

        chooseCurBackButton.setOnClickListener {
            val chooseCurBackButtonIntent = Intent(this, MainActivity::class.java)
            startActivity(chooseCurBackButtonIntent)
        }

        moreAboutButton.setOnClickListener {
            val moreAboutButtonIntent = Intent(this, MoreAboutRate::class.java)
            startActivity(moreAboutButtonIntent)
        }

        currencyList.adapter = testAdapter

    }
}