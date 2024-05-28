package com.sena.ejercicioslayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun LinearLayout(view: View){
        var intent=Intent(application,linearLayout1::class.java)
        startActivity(intent)
    }
    fun RelativeLayout(view: View){
        var intent=Intent(application,RelativeLayout2::class.java)
        startActivity(intent)
    }
    fun FrameLayout(view: View){
        var intent=Intent(application,FrameLayout3::class.java)
        startActivity(intent)
    }
    fun ConstraintLayout(view: View){
        var intent=Intent(application,ConstraintLayout4::class.java)
        startActivity(intent)
    }
    fun CardView(view: View){
        var intent=Intent(application,CardView5::class.java)
        startActivity(intent)
    }
    //fun RecyclerView(view: View){
        //var intent=Intent(application,RecyclerView6::class.java)
        //startActivity(intent)
    //}
    fun ListView(view: View){
        var intent=Intent(application,ListView7::class.java)
        startActivity(intent)
    }

    fun InterfazNavegador(view: View){
        var intent=Intent(application,Interfaz1::class.java)
        startActivity(intent)
    }
    fun InterfazLogin(view: View){
        var intent=Intent(application,Interfaz2::class.java)
        startActivity(intent)
    }
    fun InterfazAbout(view: View){
        var intent=Intent(application,Interfaz3::class.java)
        startActivity(intent)
    }
    fun InterfazListView(view: View){
        var intent=Intent(application,Interfaz4::class.java)
        startActivity(intent)
    }

}