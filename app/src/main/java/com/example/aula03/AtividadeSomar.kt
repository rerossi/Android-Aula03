package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class AtividadeSomar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade_somar)

        // Tipo de Bind 1 - findViewById

        val Valor1: EditText = findViewById(R.id.Valor1)
        val Valor2: EditText = findViewById(R.id.Valor2)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrai: Button = findViewById(R.id.buttonSubtrai)
        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        val buttonMultiplica: Button = findViewById(R.id.buttonMultiplica)

        buttonSomar.setOnClickListener {

            val valor1 = Valor1.text.toString().toInt()
            val valor2 = Valor2.text.toString().toInt()

            val resultado = valor1 + valor2
            val result1 = valor1 - valor2
            val result2 = valor1 / valor2
            val result3 = valor1 * valor2

            showAlert( "A soma e " + resultado)


        }

        buttonSubtrai.setOnClickListener {

            val valor1 = Valor1.text.toString().toInt()
            val valor2 = Valor2.text.toString().toInt()


            val result1 = valor1 - valor2


            showAlert( "A subtração e " + result1)


        }

        buttonDivide.setOnClickListener {

            val valor1 = Valor1.text.toString().toFloat()
            val valor2 = Valor2.text.toString().toFloat()


            val result2 = valor1 / valor2


            showAlert( "A soma e " + result2)


        }

        buttonMultiplica.setOnClickListener {

            val valor1 = Valor1.text.toString().toInt()
            val valor2 = Valor2.text.toString().toInt()


            val result3 = valor1 * valor2

            showAlert( "A soma e " + result3)


        }
    }

    fun showAlert(msg: String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("Ok", null)
            .create()
            .show()


    }
}