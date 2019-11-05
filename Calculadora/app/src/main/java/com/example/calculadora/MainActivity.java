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
    private String operador, numero, historial = "", historial2 = "";



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

        numero = tv_resultado.getText().toString();
        numero = numero + "1";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn2(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "2";
        tv_resultado.setText(numero);
        historial =historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn3(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "3";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn4(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "4";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn5(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "5";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn6(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "6";
        tv_resultado.setText(numero);
        historial =historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn7(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "7";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn8(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "8";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    public void btn9(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "9";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }


    public void btn0(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + "0";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);


    }

    public void btn_pto(View v){

        numero = tv_resultado.getText().toString();
        numero = numero + ".";
        tv_resultado.setText(numero);
        historial = historial2 + numero;
        tv_historial.setText(historial);

    }

    /*to do
    public void cambiar_simbolo(View v){

        if (tv_resultado.length() > 0) {
            operacionAnterior();
            tv_resultado.setText("");
            numero = "-" + numero;
            tv_resultado.setText(numero);
            //operacion = 5;
        }

    }*/

    public void operacionAnterior(){

        double numero = Double.parseDouble(this.numero);

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
        }else if(operacion==5) {
            resultado = resultado;
        }else if(operacion == 6){
            resultado = resultado;

            tv_historial.setText("");
            historial = "";
            historial2 = "";
            historial = String.valueOf(resultado);
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


    public void porcentaje(View v){
        if (tv_resultado.length() > 0) {
            operacionAnterior();
            tv_resultado.setText("");
            resultado = resultado/100;
            tv_resultado.setText(String.valueOf(resultado));
        }

    }

    public void clean (View v){ //modificar

        numero = tv_resultado.getText().toString();
        if(numero.length()>0)
        numero = numero.substring(0, numero.length()-1);
        tv_resultado.setText(numero);
        if(historial.length()>0)
        historial = historial.substring(0,historial.length()-1);
        tv_historial.setText(historial);

    }

    public void allClean(View v){

        numero = "";
        tv_resultado.setText(numero);
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

        operacion = 6;
    }


    public void off (View v){

        finish();

    }

}
