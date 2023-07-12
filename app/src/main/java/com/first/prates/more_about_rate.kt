package com.first.prates

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity

class MoreAboutRate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.more_about_rate)

        val moreBackButton = findViewById<Button>(R.id.moreAboutRateBackButton)
        val buttonScrollToTop = findViewById<ImageButton>(R.id.scrollToTop);
        val myScroll = findViewById<ScrollView>(R.id.upScroll);


        moreBackButton.setOnClickListener {
            val moreBackButtonIntent = Intent(this, ChooseCurrencySearch::class.java)
            startActivity(moreBackButtonIntent)
        }

        buttonScrollToTop.setOnClickListener(View.OnClickListener { // TODO Auto-generated method stub
            myScroll.smoothScrollTo(0, 0)
        })
    }
}

