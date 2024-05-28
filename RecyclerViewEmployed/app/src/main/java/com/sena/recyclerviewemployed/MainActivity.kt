package com.sena.recyclerviewemployed

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sena.recyclerviewemployed.adapters.adapterEmployed
import com.sena.recyclerviewemployed.models.employed

class MainActivity : AppCompatActivity() {

    lateinit var listEmployed:MutableList<employed>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //se inicializa el nullableList
        listEmployed=mutableListOf()
        //Se agrega los elementos
        var employed=employed("Carlos", "Instructor")
        listEmployed.add(employed)
        listEmployed.add(employed("Julian","Vocero"))
        listEmployed.add(employed("Laura","Aprendiz"))
        listEmployed.add(employed("Maidy","Aprendiz"))
        listEmployed.add(employed("Anlly","Instructora"))
        listEmployed.add(employed("Angie","Aprendiz"))
        listEmployed.add(employed("Teresa","Aprendiz"))
        listEmployed.add(employed("Valentina","Aprendiz"))
        listEmployed.add(employed("David","Aprendiz"))
        listEmployed.add(employed("Viviana","Aprendiz"))

        //Se crea y asocia una variable con el objeto de la vista
        var recycler=findViewById<RecyclerView>(R.id.RVEmployed)
        recycler.layoutManager= LinearLayoutManager(applicationContext)
        //Se crea el adaptador
        var adapterEmployed=adapterEmployed(listEmployed,applicationContext)
        //se asocia el adaptador con el objeto
        recycler.adapter=adapterEmployed
    }
}