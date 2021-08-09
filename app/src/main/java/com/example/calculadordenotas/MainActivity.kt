package com.example.calculadordenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = calcularNota
        val resultado = situacaoAluno

        btnCalcular.setOnClickListener{
            val nota1 = parseInt(primeiraNota.text.toString())
            val nota2 = parseInt(segundaNota.text.toString())
            val faltas = parseInt(numeroFaltas.text.toString())

            val media = (nota1 + nota2) / 2
            if(media >= 7 && faltas <=10){
                resultado.setText("Aluno aprovado!" + "\n" + "Média final:" + media)
                resultado.setTextColor(Color.GREEN)
            } else{
                resultado.setText("Aluno Reprovado!" + "\n" + "Média final:" + media)
                resultado.setTextColor(Color.RED)
            }

        }
    }
}