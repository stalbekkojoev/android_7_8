package com.example.calculatoralbetgeektech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivitys extends AppCompatActivity {
    private TextView tv_result;
    private double first, second;
    private Boolean icClickOperation = false;
    private String operation;
    private Button btn_go_over;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.btn_result);
        btn_go_over = findViewById(R.id.btn_pereity);
        findViewById(R.id.btn_pereity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitys.this, SecondActivitys.class);
                String result = ((TextView) findViewById(R.id.btn_result)).getText().toString();
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }

    public void onClickNumber(View view) {
        boolean proverka = tv_result.getText().toString().equals("0");
        boolean proverka_nol = tv_result.getText().toString().equals("1");
        switch (view.getId()) {
            case R.id.btn_clean:
                tv_result.setText("0");
                icClickOperation = false;
                first = 0;
                second = 0;
                break;
            case R.id.btn_1:
                if (proverka) {
                    tv_result.setText("1");
                } else {
                    tv_result.append("1");
                }
                if (icClickOperation) {
                    tv_result.setText("1");
                }
                break;
            case R.id.btn_2:
                if (proverka) {
                    tv_result.setText("2");
                } else {
                    tv_result.append("2");
                }
                if (icClickOperation) {
                    tv_result.setText("2");
                }
                break;
            case R.id.btn_3:
                if (proverka) {
                    tv_result.setText("3");
                } else {
                    tv_result.append("3");
                }
                if (icClickOperation) {
                    tv_result.setText("3");
                }
                break;
            case R.id.btn_4:
                if (proverka) {
                    tv_result.setText("4");
                } else {
                    tv_result.append("4");
                }
                if (icClickOperation) {
                    tv_result.setText("4");
                }
                break;
            case R.id.btn_5:
                if (proverka) {
                    tv_result.setText("5");
                } else {
                    tv_result.append("5");
                }
                if (icClickOperation) {
                    tv_result.setText("5");
                }
                break;
            case R.id.btn_6:
                if (proverka) {
                    tv_result.setText("6");
                } else {
                    tv_result.append("6");
                }
                if (icClickOperation) {
                    tv_result.setText("6");
                }
                break;
            case R.id.btn_7:
                if (proverka) {
                    tv_result.setText("7");
                } else {
                    tv_result.append("7");
                }
                if (icClickOperation) {
                    tv_result.setText("7");
                }
                break;
            case R.id.btn_8:
                if (proverka) {
                    tv_result.setText("8");
                } else {
                    tv_result.append("8");
                }
                if (icClickOperation) {
                    tv_result.setText("8");
                }
                break;
            case R.id.btn_9:
                if (proverka) {
                    tv_result.setText("9");
                } else {
                    tv_result.append("9");
                }
                if (icClickOperation) {
                    tv_result.setText("9");
                }
                break;
            case R.id.btn_0:
                if (proverka) {
                    tv_result.setText("0");
                } else {
                    tv_result.append("0");
                }
                break;
            case R.id.btn_tochka_double:
                if (!tv_result.getText().toString().contains(".")) {
                    tv_result.append(".");
                }
                break;
        }
        btn_go_over.setVisibility(View.INVISIBLE);
        icClickOperation = false;
    }

    public void onClickOperation(View view) {
        btn_go_over.setVisibility(View.INVISIBLE);
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Double.parseDouble(tv_result.getText().toString());
                icClickOperation = true;
                operation = "+";
                break;
            case R.id.btn_minus:
                first = Double.parseDouble(tv_result.getText().toString());
                icClickOperation = true;
                operation = "-";
                break;
            case R.id.btn_umnojenie:
                first = Double.parseDouble(tv_result.getText().toString());
                icClickOperation = true;
                operation = "*";
                break;
            case R.id.btn_delenie:
                first = Double.parseDouble(tv_result.getText().toString());
                icClickOperation = true;
                operation = "/";
                break;
            case R.id.btn_procent:
                first = Double.parseDouble(tv_result.getText().toString());
                Double resultt = Double.valueOf(0);
                icClickOperation = true;
                operation = "/";
                switch (operation) {
                    case "/":
                        resultt = first / 100;
                        break;
                }
                tv_result.setText(new DecimalFormat("##.#######").format(resultt));
                break;
            case R.id.btn_pol_otr:
                first = Double.parseDouble(tv_result.getText().toString());
                double resultS = Float.valueOf(0);
                icClickOperation = true;
                operation = "+-";
                switch (operation) {
                    case "+-":
                        resultS = first *= -1;
                        break;
                }
                tv_result.setText(new DecimalFormat("##.#######").format(resultS));
                break;


            case R.id.btn_eqals:
                btn_go_over.setVisibility(view.getVisibility());
                second = Double.parseDouble(tv_result.getText().toString());
                Double result = Double.valueOf(0);
                switch (operation) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "//":
                        result = first / 100;
                        break;
                }
                tv_result.setText(new DecimalFormat("##.#######").format(result));
                btn_go_over.setVisibility(view.getVisibility());
                icClickOperation = true;
                break;
        }
    }

}