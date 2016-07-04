package com.example.unam.calculadora;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)/*  */ {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cero = (Button) findViewById(R.id.Boton0);
        cero.setOnClickListener(this);
        Button one = (Button) findViewById(R.id.Boton1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.Boton2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.Boton3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.Boton4);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.Boton5);
        five.setOnClickListener(this); // calling onClick() method
        Button six = (Button) findViewById(R.id.Boton6);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.Boton7);
        seven.setOnClickListener(this);
        Button eight = (Button) findViewById(R.id.Boton8);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.Boton9);
        nine.setOnClickListener(this); // calling onClick() method


    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        TextView output = (TextView) findViewById(R.id.textView);
        String str = output.getText().toString();
        String strCero = str.substring(str.length() - 1, str.length());
        switch (v.getId()) {

            case R.id.Boton0:
                if (str.equals("0")) {
                    //do nothing, because you cant add a 0 to a 0
                } else {
                    output.append("0");
                }
                break;

            case R.id.Boton1:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("1");
                } else {
                    output.append("1");
                }
                break;

            case R.id.Boton2:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("2");
                } else {
                    output.append("2");
                }
                break;

            case R.id.Boton3:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("3");
                } else {
                    output.append("3");
                }
                break;

            case R.id.Boton4:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("4");
                } else {
                    output.append("4");
                }
                break;

            case R.id.Boton5:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("5");
                } else {
                    output.append("5");
                }
                break;

            case R.id.Boton6:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("6");
                } else {
                    output.append("6");
                }
                break;

            case R.id.Boton7:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("7");
                } else {
                    output.append("7");
                }
                break;

            case R.id.Boton8:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("8");
                } else {
                    output.append("8");
                }
                break;

            case R.id.Boton9:
                if (strCero.equals("0") && str.length() == 1) {
                    output.setText("9");
                } else {
                    output.append("9");
                }
                break;
        }
    }
}
