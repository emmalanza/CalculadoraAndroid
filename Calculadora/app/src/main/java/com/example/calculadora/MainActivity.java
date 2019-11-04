package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_mult;
    private Button btn_div;
    private Button btn_igual;
    private Button btn_pto;
    private Button btn_porcen;

    private TextView tv_resultado;
    private TextView tv_historial;

    private double resultado;
    private int operacion = 0;
    private String operador, mostrar, historial = "", historial2 = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btn_suma = findViewById(R.id.btn_suma);
        btn_resta = findViewById(R.id.btn_resta);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_igual = findViewById(R.id.btn_pto);
        btn_pto = findViewById(R.id.btn_pto);
        btn_porcen = findViewById(R.id.btn_porcen);

        tv_resultado = findViewById(R.id.tv_result);
        tv_historial = findViewById(R.id.tv_historial);



    }

    public void btn1(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "1";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn2(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "2";
        tv_resultado.setText(mostrar);
        historial =historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn3(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "3";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn4(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "4";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn5(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "5";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn6(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "6";
        tv_resultado.setText(mostrar);
        historial =historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn7(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "7";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn8(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "8";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    public void btn9(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "9";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }


    public void btn0(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + "0";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);


    }

    public void btn_pto(View v){

        mostrar = tv_resultado.getText().toString();
        mostrar = mostrar + ".";
        tv_resultado.setText(mostrar);
        historial = historial2 + mostrar;
        tv_historial.setText(historial);

    }

    //to do
    public void cambiar_simbolo(View v){

    }

    public void operacionAnterior(){

        double numero = Double.parseDouble(mostrar);

        if (operacion == 0) {
            resultado = numero;
        }if (operacion == 1) {
            resultado = resultado + numero;
        } else if (operacion == 2) {
            resultado = resultado - numero;
        } else if (operacion == 3) {
            resultado = resultado * numero;
        } else if (operacion == 4) {
            resultado = resultado / numero;
        }else if(operacion == 5){
            resultado = resultado;
        }

    }

    public void suma(View v){

        if(tv_resultado.length()>0){
            operacionAnterior();
            operador = "+";
            tv_resultado.setText("");
            historial = historial + operador;
            tv_historial.setText(historial);
            historial2 = historial;
            operacion = 1;
        }

    }

    public void resta(View v){

        if(tv_resultado.length()>0){
            operacionAnterior();
            operador = "-";
            tv_resultado.setText("");
            historial = historial + operador;
            tv_historial.setText(historial);
            historial2 = historial;
            operacion = 2;
        }

    }


    public void mult(View v){

        if(tv_resultado.length()>0) {
            operacionAnterior();
            operador = "*";
            tv_resultado.setText("");
            historial = historial + operador;
            tv_historial.setText(historial);
            historial2 = historial;
            operacion = 3;

        }

    }

    public void div(View v){

        if (tv_resultado.length() > 0) {
            operacionAnterior();
            operador = "/";
            tv_resultado.setText("");
            historial = historial + operador;
            tv_historial.setText(historial);
            historial2 = historial;
            operacion = 4;
        }

    }

    //to do
    public void porcentaje(View v){

    }

    public void clean (View v){

        mostrar = tv_resultado.getText().toString();
        if(mostrar.length()>0)
        mostrar = mostrar.substring(0,mostrar.length()-1);
        tv_resultado.setText(mostrar);
        if(historial.length()>0)
        historial = historial.substring(0,historial.length()-1);
        tv_historial.setText(historial);

    }

    public void allClean(View v){

        mostrar = "";
        tv_resultado.setText(mostrar);
        operador = "";
        historial = "";
        historial2 = "";
        tv_historial.setText(historial);
        resultado = 0;
        operacion = 0;

    }

    public void igual (View v){

        if (tv_resultado.length()>0){

            if (operador.equals("-")) {
                resultado = resultado - Double.parseDouble(tv_resultado.getText().toString());
                tv_resultado.setText(String.valueOf(resultado));
            }
            if (operador.equals("+")) {
                resultado = resultado + Double.parseDouble(tv_resultado.getText().toString());
                tv_resultado.setText(String.valueOf(resultado));
            }
            if (operador.equals("/")) {
                resultado = resultado / Double.parseDouble(tv_resultado.getText().toString());
                tv_resultado.setText(String.valueOf(resultado));
            }
            if (operador.equals("*")) {
                resultado = resultado * Double.parseDouble(tv_resultado.getText().toString());
                tv_resultado.setText(String.valueOf(resultado));
            }
        }

        operacion = 5;
    }


    public void off (View v){

        finish();

    }

}
