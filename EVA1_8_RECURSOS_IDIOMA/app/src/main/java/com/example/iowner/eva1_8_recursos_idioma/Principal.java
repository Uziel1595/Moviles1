package com.example.iowner.eva1_8_recursos_idioma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroupIdioma;
    TextView   txtNombre,txtApellido,txtEdad;
    EditText   editTextNombre,editTextApellido,editTextEdad;
    RadioButton radioButtonEspa,radioButtonIngles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        radioGroupIdioma = findViewById(R.id.radioGroupIdioma);
        radioGroupIdioma.setOnCheckedChangeListener(this);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEdad = findViewById(R.id.editTextEdad);
        radioButtonEspa = findViewById(R.id.radioButtonEspa);
        radioButtonIngles = findViewById(R.id.radioButtonIngles);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        if(i != R.id.radioButtonEspa){
            radioButtonEspa.setText(R.string.rd_espa_en);
            radioButtonIngles.setText(R.string.rd_ingles_en);
            txtNombre.setText(R.string.tv_nombre_en);
            editTextNombre.setHint(R.string.et_nombre_en);
        }
        else
        {
            radioButtonEspa.setText(R.string.rd_espa_es);
            radioButtonIngles.setText(R.string.rd_ingles_es);
            txtNombre.setText(R.string.tv_nombre_es);
            editTextNombre.setHint(R.string.et_nombre_es);
        }
    }
}
