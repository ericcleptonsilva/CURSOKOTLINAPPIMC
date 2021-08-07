package com.example.curso_kotlin_app_imc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {

    val titleTXT = findViewById<TextView>(R.id.titleTXT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


    private fun setListeners() {
        val pesoEdt = findViewById<TextView>(R.id.pesoEdit)
        val alturaEdt = findViewById<TextView>(R.id.alturaEdit)

        val btCalcular = findViewById<Button>(R.id.BtCalcular)
        pesoEdt?.doOnTextChanged{text, _, _, _->
            titleTXT?.text = text}
        alturaEdt?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show() }
        btCalcular?.setOnClickListener { calcularIMC(pesoEdt.text.toString(), alturaEdt.text.toString()) }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null ){
            val imc = peso / (altura + altura)
            titleTXT.text =  "Seu IMC é: \n%.2f".format(imc)
        }

    }


}