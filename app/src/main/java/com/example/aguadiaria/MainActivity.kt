package com.example.aguadiaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val prefs = GlassPreferences(this)

    var today: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_small).setOnClickListener {
            saveGlass(GlassType.SMALL)
        }
        findViewById<Button>(R.id.btn_medium).setOnClickListener {
            saveGlass(GlassType.MEDIUM)

        }
        findViewById<Button>(R.id.btn_large).setOnClickListener {
            saveGlass(GlassType.LARGE)

        }
    }
    private fun saveGlass(glassType: GlassType) {
            prefs.save(today + glassType.value)
    }
    private  fun refresh() {
        val value = prefs.fetch()
        today = value
        findViewById<TextView>(R.id.txt_result).text = today.toString()
    }
}