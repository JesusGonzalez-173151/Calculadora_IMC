package com.jesusgonzalez_173151.asignacion4_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso: EditText = findViewById(R.id.weight) as EditText
        val altura: EditText = findViewById(R.id.height) as EditText
        val calcular: Button = findViewById(R.id.calculate) as Button
        val imc1: TextView = findViewById(R.id.imc) as TextView
        val rango: TextView = findViewById(R.id.range) as TextView

        calcular.setOnClickListener{
            var p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()

            var imc2: Float = p/(a*a)

            imc1.setText("" + imc2)

            if(imc2<=18.5){
                rango.setBackgroundResource(R.color.greenish)
            }
            else if(imc1 >= 19  && imc1<=24.9){
                rango.setBackgroundResource(R.color.green)
            }
            else if(imc1>=25  && imc1<=29.9){
                rango.setBackgroundResource(R.color.yellow)
            }
            else if(imc1>=30  && imc1<=39.9){
                rango.setBackgroundResource(R.color.orange)
            }
            else if(imc1>=40){
                rango.setBackgroundResource(R.color.red)
            }
        }

    }
}