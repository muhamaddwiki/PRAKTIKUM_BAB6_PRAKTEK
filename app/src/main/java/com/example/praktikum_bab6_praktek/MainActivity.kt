package com.example.praktikum_bab6_praktek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val id: Int = 10
    val language:String = "Kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_klik.setOnClickListener(){
            intent = Intent(this, ActivtyKedua::class.java)
            intent.putExtra("Id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}