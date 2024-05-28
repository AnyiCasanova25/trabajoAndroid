package com.sena.ejercicioslayout

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Interfaz4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interfaz4)

        val ciudades= arrayOf("Veracruz","Tabasco","Chiapas","Campeche","Quintana Roo")
        val adaptador=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ciudades)
        val listView2=findViewById<ListView>(R.id.listView2)
        listView2.adapter=adaptador
        /*
        val adaptador=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,meses)
        val listView=findViewById<ListView>(R.id.listView)
        listView.adapter=adaptador
        */

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}