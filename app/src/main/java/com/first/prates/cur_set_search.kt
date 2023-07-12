package com.first.prates

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CurSetSearch : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.cur_set_search)

                val curSettingsBackButton = findViewById<Button>(R.id.curSetBackButton)
                val currencyList = findViewById<ListView>(R.id.ListView)
                val testAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1 , arrayOf<String>("AMD - Армянский драм", "USD - Доллар США", "RUB - Российский рубль", "GEL - Грузинский лари"))


                curSettingsBackButton.setOnClickListener {
                    val curSettingsBackButtonIntent = Intent(this, CurrencySettings::class.java)
                    startActivity(curSettingsBackButtonIntent)
                }

                currencyList.adapter = testAdapter


            }
}

