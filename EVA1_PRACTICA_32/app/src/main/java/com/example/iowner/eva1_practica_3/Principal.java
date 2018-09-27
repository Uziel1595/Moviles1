package com.example.iowner.eva1_practica_3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Iterator;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, Button.OnClickListener {

    EditText editTxtNombre, editTxtApellido, editTxtEdad, editTxtOrg, editTxtCorreo;
    RadioGroup rdGrpSexo;
    Button btnAgregar;
    String sNombre, sApellido, sEdad, sOrg, sCorreo, sSexo;
    Registros lista;
    int noRegistros = 0,idH,idM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lista = new Registros();
        int rotation = ((WindowManager) this.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getOrientation();
        switch (rotation) {
            case Surface.ROTATION_0:
            case Surface.ROTATION_180:

                //Vinculacion
                editTxtNombre = findViewById(R.id.editTxtNombre);
                editTxtApellido = findViewById(R.id.editTxtApellido);
                editTxtEdad = findViewById(R.id.editTxtEdad);
                editTxtOrg = findViewById(R.id.editTxtOrg);
                editTxtCorreo = findViewById(R.id.editTxtCorreo);
                rdGrpSexo = findViewById(R.id.rdGrpSexo);
                btnAgregar = findViewById(R.id.btnAgregar);
                idH = R.id.rdBtnH;
                idM =R.id.rdBtnM;
                break;
            case Surface.ROTATION_90:
                //Vinculacion
                editTxtNombre = findViewById(R.id.editTxtNombre2);
                editTxtApellido = findViewById(R.id.editTxtApellido2);
                editTxtEdad = findViewById(R.id.editTxtEdad2);
                editTxtOrg = findViewById(R.id.editTxtOrg2);
                editTxtCorreo = findViewById(R.id.editTxtCorreo2);
                rdGrpSexo = findViewById(R.id.rdGrpSexo2);
                btnAgregar = findViewById(R.id.btnAgregar2);
                idH = R.id.rdBtnH2;
                idM =R.id.rdBtnM2;
                break;
        }
        //Escuchadores
        rdGrpSexo.setOnCheckedChangeListener(this);
        btnAgregar.setOnClickListener(this);



    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i == idH){
            sSexo = "Hombre";
        }
        else{
            sSexo = "Mujer";
        }
    }

    @Override
    public void onClick(View view) {
        boolean esta = true;
        sNombre = editTxtNombre.getText().toString();
        sApellido = editTxtApellido.getText().toString();
        sEdad = editTxtEdad.getText().toString();
        sOrg = editTxtOrg.getText().toString();
        sCorreo = editTxtCorreo.getText().toString();
        Registro nuevoRegistro = new Registro(sNombre,sApellido,sEdad,sSexo,sOrg,sCorreo);

        Iterator<Registro> iterator = lista.listaRegistros.iterator();
        while(iterator.hasNext()){
            Registro r = iterator.next();
            if(r.sCorreo.equals(sCorreo)){
                esta = false;
            }
        }
        if(esta){
            lista.listaRegistros.add(nuevoRegistro);
            noRegistros++;
            Toast.makeText(this,noRegistros+"",Toast.LENGTH_LONG).show();

            editTxtNombre.setText("");
            editTxtApellido.setText("");
            editTxtEdad.setText("");
            editTxtOrg.setText("");
            editTxtCorreo.setText("");
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        else{
            Toast.makeText(this,"Este correo ya esta registrado",Toast.LENGTH_LONG).show();
            editTxtCorreo.setFocusable(true);
        }

    }
}
