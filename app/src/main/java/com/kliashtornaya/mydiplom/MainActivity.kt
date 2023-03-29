package com.kliashtornaya.mydiplom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMenuButtons()
    }
    private fun initMenuButtons() {
        var buttonMenu=findViewById<Button>(R.id.button_menu)
        buttonMenu.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        var buttonFavorites=findViewById<Button>(R.id.button_favorites)
        buttonFavorites.setOnClickListener {
            Toast.makeText(this, "ИЗБРАННОЕ", Toast.LENGTH_SHORT).show()
        }
        var buttonViewLater=findViewById<Button>(R.id.button_view_later)
        buttonViewLater.setOnClickListener {
            Toast.makeText(this, "ПОСМОТРЕТЬ ПОЗЖЕ", Toast.LENGTH_SHORT).show()
        }
        var buttonSelections=findViewById<Button>(R.id.button_selections)
        buttonSelections.setOnClickListener {
            Toast.makeText(this, "ПОДБОРКИ", Toast.LENGTH_SHORT).show()
        }
        var buttonSetting=findViewById<Button>(R.id.button_settings)
        buttonSetting.setOnClickListener {
            Toast.makeText(this, "НАСТРОЙКИ", Toast.LENGTH_SHORT).show()
        }
    }
}