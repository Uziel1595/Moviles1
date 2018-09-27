package com.example.iowner.eva1_5_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements  RadioGroup.OnCheckedChangeListener {

    RadioGroup rdGroupOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdGroupOpciones = findViewById(R.id.rdGroupOpciones);
        rdGroupOpciones.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String sMensa = "";
        switch (i){
            case R.id.rdBtnTacos:
                sMensa = "Tacos";
                break;
            case R.id.rdBtnTortas:
                sMensa = "Tortas";
                break;
            case R.id.rdBtnTamales:
                sMensa = "Tamales";

            case R.id.rdBtnRellenos:
                sMensa = "Chiles Rellenos";
                break;
            case R.id.rdBtnMontados:
                sMensa = "Montados";
                break;
        }
        Toast.makeText(this,sMensa,Toast.LENGTH_LONG).show();
    }
}
