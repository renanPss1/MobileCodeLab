package com.example.contadorrenan

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtContador = findViewById<TextView>(R.id.contador)
        val btnIncremento = findViewById<Button>(R.id.incremento)
        val btnDecremento = findViewById<Button>(R.id.decremento)

        // Inicializa o contador
        txtContador.text = contador.toString()

        btnIncremento.setOnClickListener {
            contador++
            txtContador.text = contador.toString()
        }

        btnDecremento.setOnClickListener {
            contador--
            txtContador.text = contador.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
