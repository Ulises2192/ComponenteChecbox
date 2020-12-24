package com.ulisesdiaz.componentechecbox;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/****
 * Project: ComponenteChecbox
 * From: com.ulisesdiaz.componentechecbox
 * Created by: Ulises Diaz on 23/12/20 ar 08:25 PM
 * All rights reserved 2020
 ****/
public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox chbPeliculas, chbSeries;
    private RadioButton rbMujer, rbHombre, rbIndefinido;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chbPeliculas = (CheckBox) findViewById(R.id.chbPeliculas);
        chbSeries = (CheckBox) findViewById(R.id.chbSeries);
        rbMujer = (RadioButton) findViewById(R.id.rbMujer);
        rbHombre = (RadioButton) findViewById(R.id.rbHombre);
        rbIndefinido = (RadioButton) findViewById(R.id.rbIndefinido);

        chbPeliculas.setOnClickListener(this);
        chbSeries.setOnClickListener(this);
        rbMujer.setOnClickListener(this);
        rbHombre.setOnClickListener(this);
        rbIndefinido.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chbPeliculas:
                if (chbPeliculas.isChecked()){
                    Toast.makeText(this, "Java: Peliculas seleccionado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Java: Peliculas deseleccionado", Toast.LENGTH_SHORT).show();
                }
            break;

            case R.id.chbSeries:
                if (chbSeries.isChecked()){
                    Toast.makeText(this, "Java: Series seleccionado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Java: Series deseleccionado", Toast.LENGTH_SHORT).show();
                }
            break;

            case R.id.rbMujer:
                Toast.makeText(this, "Java: Sexo Mujer presionado", Toast.LENGTH_SHORT).show();
            break;

            case R.id.rbHombre:
                Toast.makeText(this, "Java: Sexo Hombre presionado", Toast.LENGTH_SHORT).show();
            break;

            case R.id.rbIndefinido:
                Toast.makeText(this, "Java: Sexo Indefindo presionado", Toast.LENGTH_SHORT).show();
            break;

        }
    }
}
