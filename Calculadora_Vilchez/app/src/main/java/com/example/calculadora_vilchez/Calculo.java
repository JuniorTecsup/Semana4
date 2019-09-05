package com.example.calculadora_vilchez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Calculo extends AppCompatActivity {

    private Spinner spinner_var;
    private EditText N1T_var;
    private EditText N2T_var;

    private EditText N1L_var;
    private EditText N2L_var;
    private EditText N3L_var;
    private EditText N4L_var;

    private TextView Resultado_var;
    private TextView PromedioTeoria_var;
    private TextView PromedioLab_var;
    private TextView AprobadoSINO_var;
    private TextView PromedioFinal_var;
    private Button BotonEvento_var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        spinner_var=(Spinner)findViewById(R.id.SpinnerP);

        PromedioFinal_var=(TextView)findViewById(R.id.PromedioFinal);

        BotonEvento_var=(Button)findViewById(R.id.BotonEvento);
        N1T_var=(EditText)findViewById(R.id.Nota1_T);
        N2T_var=(EditText)findViewById(R.id.Nota1_T);
        N1L_var=(EditText)findViewById(R.id.Nota1_L);
        N2L_var=(EditText)findViewById(R.id.Nota2_L);
        N3L_var=(EditText)findViewById(R.id.Nota3_L);
        N4L_var=(EditText)findViewById(R.id.Nota4_L);
        PromedioLab_var=(TextView)findViewById(R.id.PromedioLab);
        PromedioTeoria_var=(TextView)findViewById(R.id.PromedioTeoria);
        AprobadoSINO_var=(TextView)findViewById(R.id.AprobadoSINO);






        BotonEvento_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String N1T_stri=N1T_var.getText().toString();
                String N2T_stri=N2T_var.getText().toString();
                String N1L_stri=N1L_var.getText().toString();
                String N2L_stri=N2L_var.getText().toString();
                String N3L_stri=N3L_var.getText().toString();
                String N4L_stri=N4L_var.getText().toString();

                double N1T_int=Double.parseDouble(N1T_stri);
                double N2T_int=Double.parseDouble(N2T_stri);
                double N1L_int=Double.parseDouble(N1L_stri);
                double N2L_int=Double.parseDouble(N2L_stri);
                double N3L_int=Double.parseDouble(N3L_stri);
                double N4L_int=Double.parseDouble(N4L_stri);





                int posicion=spinner_var.getSelectedItemPosition();
                double mayor;
                if(posicion==0){
                    if(N1T_int>N2T_int){
                        mayor=N1T_int;
                    }else{
                        mayor=N2T_int;
                    }
                    double ResT =  mayor*20/100;
                    double ResLP = (N1L_int+N2L_int+N3L_int+N4L_int)/4;
                    double ResL = ResLP*80/100;
                    double ResF = ResL+ResT;
                    String ResF_s=Double.toString(ResF);
                    PromedioFinal_var.setText(ResF_s);
                    String ResLP_s=Double.toString(ResLP);
                    PromedioTeoria_var.setText("Prom: "+ResLP_s);

                    String mayor_s=Double.toString(mayor);
                    PromedioLab_var.setText("Prom "+mayor_s);

                    if(ResF<=12.5){
                        AprobadoSINO_var.setText("Desaprobaste");
                    }else{
                        AprobadoSINO_var.setText("Aprobaste");
                    }

                }else if(posicion==1){
                    if(N1T_int>N2T_int){
                        mayor=N1T_int;
                    }else{
                        mayor=N2T_int;
                    }
                    double ResT = mayor*30/100;
                    double ResLP = (N1L_int+N2L_int+N3L_int+N4L_int)/4;
                    double ResL = ResLP*70/100;
                    double ResF = ResL+ResT;
                    String ResF_s=Double.toString(ResF);
                    PromedioFinal_var.setText(ResF_s);
                    String ResLP_s=Double.toString(ResLP);
                    PromedioTeoria_var.setText("Prom: "+ResLP_s);

                    String mayor_s=Double.toString(mayor);
                    PromedioLab_var.setText("Prom "+mayor_s);

                    if(ResF<=12.5){
                        AprobadoSINO_var.setText("Desaprobaste");
                    }else{
                        AprobadoSINO_var.setText("Aprobaste");
                    }

                }else{
                    if(N1T_int>N2T_int){
                        mayor=N1T_int;
                    }else{
                        mayor=N2T_int;
                    }
                    double ResT = mayor*40/100;
                    double ResLP = (N1L_int+N2L_int+N3L_int+N4L_int)/4;
                    double ResL = ResLP*60/100;
                    double ResF = ResL+ResT;
                    String ResF_s=Double.toString(ResF);
                    PromedioFinal_var.setText(ResF_s);
                    String ResLP_s=Double.toString(ResLP);
                    PromedioTeoria_var.setText("Prom: "+ResLP_s);

                    String mayor_s=Double.toString(mayor);
                    PromedioLab_var.setText("Prom "+mayor_s);

                    if(ResF<=12.5){
                        AprobadoSINO_var.setText("Desaprobaste");
                    }else{
                        AprobadoSINO_var.setText("Aprobaste");
                    }
                }



            }
        });



    }

}