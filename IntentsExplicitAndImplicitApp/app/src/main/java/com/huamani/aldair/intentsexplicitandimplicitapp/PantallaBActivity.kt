package com.huamani.aldair.intentsexplicitandimplicitapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class PantallaBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_bactivity)
    }

    fun closeActivity(view: android.view.View) {
        val intent = Intent()
        intent.putExtra("NAME", "Dato adicional de retorno.")
        intent.putExtra("NAME", "Dato adicional de retorno.")
        intent.putExtra("NAME", "Dato adicional de retorno.")
        intent.putExtra("NAME", "Dato adicional de retorno.")
        setResult(RESULT_OK, intent) // Set ResultCode and DataIntent
        finish()
    }
}