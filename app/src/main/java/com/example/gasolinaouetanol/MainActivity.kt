package com.example.gasolinaouetanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pGasolina: Float = 0f
    var pEtanol: Float = 0f

    fun comparar(): Boolean {
        return pEtanol < pGasolina*0.7
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_comparar.setOnClickListener{
            /* Toast.makeText(this, "Clicando comparar", Toast.LENGTH_SHORT).show() */

            pGasolina = et_gasolina.text.toString().toFloat()
            pEtanol = et_etanol.text.toString().toFloat()

            when(comparar()){
                true -> iv_resultado.setImageResource(R.drawable.abasteca_etanol)
                false -> iv_resultado.setImageResource(R.drawable.abasteca_gasolina)
            }



        }

    }
}