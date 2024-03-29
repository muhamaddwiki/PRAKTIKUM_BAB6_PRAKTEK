package com.example.praktikum_bab6_praktek
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_data.*


class ActivtyKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)


        val bundle = intent.extras
        if(bundle != null) {
            val id = bundle.getInt("Id_value")
            val language = bundle.getString("language_value")
            Toast.makeText(
                applicationContext, id.toString() + " " +
                        language, Toast.LENGTH_LONG).show()

            btn_back.setOnClickListener {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
