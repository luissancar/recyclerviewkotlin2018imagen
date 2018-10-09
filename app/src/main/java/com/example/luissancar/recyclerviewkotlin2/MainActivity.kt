package com.example.luissancar.recyclerviewkotlin2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_datos.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Initializing an empty ArrayList to be filled with animals
  //  val datos: ArrayList<String> = ArrayList()
    val datos: ArrayList<registro> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Carga array  con datos
        addDatos()
        // Crea layout  vertical Layout
        recyclerViewMain.layoutManager = LinearLayoutManager(this)

        // si quieres utilizar mas de una columna
        recyclerViewMain.layoutManager = GridLayoutManager(this, 1)

        // Acede al RecyclerView Adapter y lee datos
        recyclerViewMain.adapter = DatosAdapter(datos, this)




    }

    fun addDatos(){
        for (i in 1..100) {
            var reg: registro=registro("dato A " + i.toString(),"dato B " + i.toString(),"http://gcba.github.io/iconos/Iconografia_PNG/arbol.png")
            datos.add(reg)
        }

    }
}
