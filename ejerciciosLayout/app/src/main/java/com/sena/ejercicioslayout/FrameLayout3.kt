package com.sena.ejercicioslayout

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class FrameLayout3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_frame_layout3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnVolver2:Button=findViewById<Button>(R.id.btnVolver2)
        btnVolver2.setOnClickListener{
            finish()
        }
        /*
         var btnVolver1:Button=findViewById<Button>(R.id.btnVolver1)
        btnVolver1.setOnClickListener{
            finish()
        }
        */

        var btnCambioFragmento1=findViewById<Button>(R.id.btnCambioFragment1)
        btnCambioFragmento1.setOnClickListener {  cambioFragment(1)}
    }
    //metodo que gestiona el cambio de fragmentos

    fun cambioFragment(position:Int){

        //position= indica el fragmento deseado
        //fragmento= indica el fragmento a cambiar

        var fragment:Fragment
        when(position){

            /*
            segun el valor de position, se va a cambiar
            el fragmento
            */

            1 ->fragment=firstFragment()
            else->fragment=firstFragment()
        }
        /*
        supportFragmentManager es el que gestiona
        el cambio de fragmentos
        */

        val fragmentManager=supportFragmentManager
        //se crea el objeto de la transicion del fragmento

        val fragmentTransition=fragmentManager.beginTransaction()

        //se crea la accion de cambio
        /*
        fragmentTransition.replace(id_del_contenedor,clase_del_fragmento)
        */

        fragmentTransition.replace(R.id.FVC,fragment)
        fragmentTransition.commit()
    }

}