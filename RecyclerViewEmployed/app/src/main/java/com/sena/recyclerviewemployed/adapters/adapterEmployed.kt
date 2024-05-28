package com.sena.recyclerviewemployed.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sena.recyclerviewemployed.R
import com.sena.recyclerviewemployed.models.employed

/*Esta clase es la encargada de cargar los datos
 en el recycler view
 para instanciar la clase se requieren unos parametros
 1.Lista elementos
 2.Contexto de la aplicacion


 Esta clase debe heredar de la clase
 recyclerView.adapter
 Para heredar se utiliza: y la clase de donde se va a heredar
 */

class adapterEmployed (
    var listEmployed:List<employed>,
    var context:Context
):RecyclerView.Adapter<adapterEmployed.MyHolder>()


{
/*
se crea la clase MyHolder
 */



inner class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    /*
    Dentro de la clase recyclerView se crea las variables
    y se asocian los objetos de la vista item
    */
    lateinit var lblName: TextView
    lateinit var lblPosition: TextView

    init {
        lblName=itemView.findViewById(R.id.lblName)
        lblPosition=itemView.findViewById(R.id.lblPosition)
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterEmployed.MyHolder {
        var itemView=LayoutInflater.from(context).inflate(R.layout.item_employed,parent,false)
        return MyHolder(itemView)
    }


    override fun onBindViewHolder(holder: adapterEmployed.MyHolder, position: Int) {
        //Obtener registro
        val employed=listEmployed[position]
        //asignar valores
        holder.lblName.text=employed.name
        holder.lblPosition.text=employed.position
    }
/*
getItemCount: retorna el numero de elementos
de la lista
*/
    override fun getItemCount(): Int {
        return listEmployed.size
    }
}