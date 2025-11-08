package br.edu.mk.trocatela

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListarActivity : AppCompatActivity() {

    private lateinit var lvBebidas: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        lvBebidas = findViewById(R.id.lvBebidas)


        lvBebidas.setOnItemClickListener{parent, view, position, id ->
            val codigo = position+1

            intent.putExtra("cod", codigo)
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}