package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.btnAbout)
        btn.setOnClickListener() {
//            val intent = Intent(this, About::class.java)
//       val geo= Uri.parse("geo: 4.0224,101.0206")
//            val intent=Intent(Intent.ACTION_VIEW,geo)
//            val telNo= Uri.parse("Tel:0149316426")
//            val intent=Intent(Intent.ACTION_DIAL,telNo)
            val intent=Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT,"HIHI")
            startActivity(intent)
        }
    }
}