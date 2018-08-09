package com.example.skyler.botlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        encourage(encourageText)
    }

    fun encourage(view: View) {
        val encouragement: Array<String> = resources.getStringArray(R.array.message_array)
        val random = Random()
        val randomInt = random.nextInt(encouragement.size)
        encourageText.text = encouragement[randomInt]
    }
}
