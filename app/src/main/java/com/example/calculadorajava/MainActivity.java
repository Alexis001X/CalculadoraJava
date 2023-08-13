package com.example.calculadorajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView resultado;
     private EditText numero1;
     private EditText numero2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(suma( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString() ))+"");
            }
        });
        btn_resta = findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resta( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString() ))+"");
            }
        });
        btn_multiplicacion = findViewById(R.id.btn_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(multiplicacion( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString() ))+"");
            }
        });
        btn_division = findViewById(R.id.btn_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(division( Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString() ))+"");
            }
        });
        resultado = findViewById(R.id.Resultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

    }
    public double suma (int a, int b){
        return a+b;
    }
    public double resta (int a, int b){
        return a-b;
    }
    public double multiplicacion (int a, int b){
        return a*b;
    }
    public double division (int a, int b){
        int respuesta = 0;
        if(b!=0){
            respuesta=a/b;
            Toast.makeText(this,"No existe division para 0", Toast.LENGTH_SHORT).show();
        }
        return respuesta;
    }
}