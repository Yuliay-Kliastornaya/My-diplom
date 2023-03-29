package com.kliashtornaya.mydiplom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavigation()
    }
  private fun initNavigation() {
      var topAppBar=findViewById<Toolbar>(R.id.topAppBar)
      topAppBar.setOnMenuItemClickListener {
          when (it.itemId) {
              R.id.settings -> {
                  Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                  true
              }
              else -> false
          }
      }

      var bottom_navigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
      bottom_navigation.setOnItemSelectedListener{

          when (it.itemId) {
              R.id.favorites -> {
                  Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                  true
              }
              R.id.watch_later -> {
                  Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                  true
              }
              R.id.selections -> {
                  Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                  true
              }
              else -> false
          }
      }

  }
}