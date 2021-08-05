package com.example.curso_kotlin_app_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle","Criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","A Tela está visível!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","A Tela está liberada para você usar!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","A Tela está pausada até voce focar na tela!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle","A Tela está em segundo plano até voce ativar de novo!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle","A Tela foi destruída!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle","A Tela está retornando para você!")
    }
}