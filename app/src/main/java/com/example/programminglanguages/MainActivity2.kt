package com.example.programminglanguages

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textName : TextView = findViewById(R.id.textName)
        val textDescrip : TextView = findViewById(R.id.textDescrip)
        val image : ImageView = findViewById(R.id.ImageView)
        val btn : Button = findViewById(R.id.btnlearnmore)

        val name : String? = intent.getStringExtra("name")
        val descrip : String? = intent.getStringExtra("desc")
        val Image  = intent.getIntExtra("img",0)

        val link = intent.getStringExtra("link")

        textName.setText(name)
        textDescrip.setText(descrip)
        image.setImageResource(Image)

        btn.setOnClickListener(){
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(i)
            }
            catch (e : Exception){
                Toast.makeText(this, "Your link is wrong", Toast.LENGTH_SHORT).show()
            }
        }


    }
}