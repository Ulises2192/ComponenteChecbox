package com.ulisesdiaz.componentechecbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var chbPeliculas: CheckBox? = null
    private var chbSeries: CheckBox? = null
    private var rbMujer: RadioButton? = null
    private var rbHombre: RadioButton? = null
    private var rbIndefinido: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chbPeliculas = findViewById(R.id.chbPeliculas)
        chbSeries = findViewById(R.id.chbSeries)
        rbMujer = findViewById(R.id.rbMujer)
        rbHombre = findViewById(R.id.rbHombre)
        rbIndefinido = findViewById(R.id.rbIndefinido)


        chbPeliculas?.setOnClickListener(this)
        chbSeries?.setOnClickListener(this)
        rbMujer?.setOnClickListener(this)
        rbHombre?.setOnClickListener(this)
        rbIndefinido?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.chbPeliculas->{
                if (chbPeliculas?.isChecked!!){
                    Toast.makeText(this, "Kotlin: Peliculas seleccionado", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "Kotlin: Peliculas deseleccionado", Toast.LENGTH_SHORT).show()
                }
            }

            R.id.chbSeries->{
                if (chbSeries?.isChecked!!){
                    Toast.makeText(this, "Kotlin: Series seleccionado", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "Kotlin: Series deseleccionado", Toast.LENGTH_SHORT).show()
                }
            }

            R.id.rbMujer->{
                Toast.makeText(this, "Kotlin: Se selecciono sexo Mujer", Toast.LENGTH_SHORT).show()
            }

            R.id.rbHombre->{
                Toast.makeText(this, "Kotlin: Se selecciono sexo Hombre", Toast.LENGTH_SHORT).show()

            }

            R.id.rbIndefinido->{
                Toast.makeText(this, "Kotlin: Se selecciono sexo Indefinido", Toast.LENGTH_SHORT).show()

            }
        }
    }
}