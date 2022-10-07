package com.example.registro_datos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etn_Nombre:EditText
    lateinit var etn_Edad:EditText
    lateinit var etn_Departamento:EditText
    lateinit var tv_Resultado:TextView
    private var lv_Nombres:ListView?=null
    private var lv_Edad:ListView?=null
    private var lv_Depar:ListView?=null
    private var tv_TextM:TextView?=null

    private val Lista = arrayOf("Jorge", "Diego", "Astrid", "Gabriela", "Rebeca", "Fer")
    private val Edad = arrayOf("15", "18 ", "20 ", "13 ", "21 ", "20 ")
    private val Depar = arrayOf("San Salvador", "Santa Ana", "San Miguel", "La Union", "Usulutan", "Cabañas")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv_Nombres = findViewById(R.id.lv_Nombres)
        tv_TextM = findViewById(R.id.tv_TextoM)

        var adaptador:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.list_register, Lista)
        lv_Nombres?.adapter = adaptador
        lv_Nombres?.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                tv_TextM?.text = "La edad de ${lv_Nombres?.getItemAtPosition(p2)} es ${Edad[p2]} años y vive en el departamento de ${Depar[p2]}"

            }

        }

    }










}