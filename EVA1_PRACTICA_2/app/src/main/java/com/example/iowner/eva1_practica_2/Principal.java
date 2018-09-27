package com.example.iowner.eva1_practica_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    EditText editTextAno;
    RadioGroup rdGpRegiones,rdGpGenero;
    RadioButton rdRegiones,rdAmerica,rdAsia,rdHombre,rdMujer;
    TextView txtVida,txtFecha;
    int a=0,b=0;
    final double[][] iArExpec = {{5,75,60,45,35},{4.5,75,65,50,45},{4,80,70,65,55},{3.5,80,75,65,60},{3,85,75,60,55},{2,90,70,65,60}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        editTextAno = findViewById(R.id.editTextAno);
        rdGpRegiones = findViewById(R.id.rdGpRegion);
        rdGpGenero = findViewById(R.id.rdGpGenero);
        rdRegiones = findViewById(R.id.rdBtnRegion);
        rdAmerica = findViewById(R.id.rdBtnAmerica);
        rdAsia = findViewById(R.id.rdBtnAsia);
        rdHombre = findViewById(R.id.rdBtnHombre);
        rdMujer = findViewById(R.id.rdBtnMujer);
        txtVida = findViewById(R.id.txtVida);
        txtFecha = findViewById(R.id.txtFecha);
        rdGpGenero.setOnCheckedChangeListener(this);
        rdGpRegiones.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int iAno = Integer.parseInt(editTextAno.getText().toString());
        boolean bGenero = true;
        switch(i){
            case R.id.rdBtnRegion:
                b = 1;
                if(iAno<1960)
                    a = 0;
                else{
                    if(iAno<1970)
                        a = 1;
                    else{
                        if(iAno<1980)
                            a=2;
                        else{
                            if(iAno<1990)
                                a=3;
                            else{
                                if (iAno < 2000)
                                    a = 4;
                                else{
                                    a=5;
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.rdBtnAmerica:
                b = 2;
                if(iAno<1960)
                    a = 0;
                else{
                    if(iAno<1970)
                        a = 1;
                    else{
                        if(iAno<1980)
                            a=2;
                        else{
                            if(iAno<1990)
                                a=3;
                            else{
                                if (iAno < 2000)
                                    a = 4;
                                else{
                                    a=5;
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.rdBtnAsia:
                b = 3;
                if(iAno<1960)
                    a = 0;
                else{
                    if(iAno<1970)
                        a = 1;
                    else{
                        if(iAno<1980)
                            a=2;
                        else{
                            if(iAno<1990)
                                a=3;
                            else{
                                if (iAno < 2000)
                                    a = 4;
                                else{
                                    a=5;
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.rdBtnAfrica:
                b = 4;
                if(iAno<1960)
                    a = 0;
                else{
                    if(iAno<1970)
                        a = 1;
                    else{
                        if(iAno<1980)
                            a=2;
                        else{
                            if(iAno<1990)
                                a=3;
                            else{
                                if (iAno < 2000)
                                    a = 4;
                                else{
                                    a=5;
                                }
                            }
                        }
                    }
                }
                break;
            case R.id.rdBtnHombre:
                bGenero = true;
                break;
            case R.id.rdBtnMujer:
                bGenero = false;
                break;

        }
        double dVida = iArExpec[a][b];
        if(bGenero)
            dVida-=iArExpec[a][0];
        else
            dVida+=iArExpec[a][0];
        String sVida = dVida+"";
        txtVida.setText(sVida);
        txtFecha.setText((double)iAno+dVida+"");
    }
}
