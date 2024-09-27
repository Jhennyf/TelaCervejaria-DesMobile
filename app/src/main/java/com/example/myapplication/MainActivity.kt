package com.example.myapplication
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button as btnCerveja

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cervejas = listOf("Heineken", "Budweiser", "Corona", "Skol", "Brahma")

        val button: btnCerveja = findViewById(R.id.btnCerveja)
        button.setOnClickListener {
            val textView: TextView = findViewById(R.id.textView)
            val listaCervejas = cervejas.joinToString(separator = "\n")
            textView.text = listaCervejas
        }
    }
}
