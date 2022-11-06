package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;


public class MainActivity extends AppCompatActivity {

    private Button btnPlus, btnZero, btnComma, btnMultiply, btnNine, btnEight, btnSeven, btnMinus, btnSix,btnFive, btnFour, btnDivide, btnThree, btnTwo,btnOne, btnAnswer, btnDelete, btnReset;
    private TextView txtResult;
    private String number;
    private String calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        number = "";
        final double[] first = new double[1];

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "0";
                txtResult.setText(number);
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "1";
                txtResult.setText(number);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "2";
                txtResult.setText(number);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "3";
                txtResult.setText(number);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "4";
                txtResult.setText(number);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "5";
                txtResult.setText(number);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "6";
                txtResult.setText(number);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "7";
                txtResult.setText(number);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "8";
                txtResult.setText(number);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "9";
                txtResult.setText(number);
            }
        });
        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.isEmpty()) {
                    number = "0.";
                }else {
                    if (number.contains(".")) {
                    }else {
                        number += ".";
                    }

                }
                txtResult.setText(number);
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number.isEmpty()) {
                    Double number1 = Double.valueOf(number);
                    first[0] = number1;
                }
                System.out.println(number);
                number = "";
                calculation = "+";
                txtResult.setText(calculation);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number.isEmpty()) {
                    Double number1 = Double.valueOf(number);
                    first[0] = number1;
                }
                number = "";
                calculation = "-";
                txtResult.setText(calculation);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number.isEmpty()) {
                    Double number1 = Double.valueOf(number);
                    first[0] = number1;
                }
                number = "";

                calculation = "/";
                txtResult.setText(calculation);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number.isEmpty()) {
                    Double number1 = Double.valueOf(number);
                    first[0] = number1;
                }
                number = "";
                calculation = "*";
                txtResult.setText(calculation);
            }
        });
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number.isEmpty()) {
                    Double number2 = Double.valueOf(number);
                    String  result = null;
                    if (calculation.equals("+")) {
                        result = (new BigDecimal(first[0]*number2).toPlainString());
                        number = result;
                        txtResult.setText(result);
                        calculation = "";
                    } else if (calculation.equals("-")) {
                        result = (new BigDecimal(first[0]*number2).toPlainString());
                        number = result;
                        txtResult.setText(result);
                        calculation = "";
                    } else if (calculation.equals("*")) {
                        result = (new BigDecimal(first[0]*number2).toPlainString());
                        number = result;
                        txtResult.setText(result);
                        calculation = "";
                    } else if (calculation.equals("/")) {
                        if (number2!=0) {
                            result = (new BigDecimal(first[0]*number2).toPlainString());
                            number = result;
                            txtResult.setText(result);
                        }else {
                            txtResult.setText("Error");
                        }

                        calculation = "";
                    }
                }
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!number.isEmpty()) {
                    number = number.substring(0,number.length()-1);
                    txtResult.setText(number);
                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "";
                calculation = "";
                txtResult.setText(number);
            }
        });
    }

    private void initViews() {
        btnPlus = findViewById(R.id.btnPlus);
        btnZero = findViewById(R.id.btnZero);
        btnComma = findViewById(R.id.btnComma);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnNine = findViewById(R.id.btnNine);
        btnEight = findViewById(R.id.btnEight);
        btnSeven = findViewById(R.id.btnSeven);
        btnMinus = findViewById(R.id.btnMinus);
        btnSix = findViewById(R.id.btnSix);
        btnFive = findViewById(R.id.btnFive);
        btnFour = findViewById(R.id.btnFour);
        btnDivide = findViewById(R.id.btnDivide);
        btnThree = findViewById(R.id.btnThree);
        btnTwo = findViewById(R.id.btnTwo);
        btnOne = findViewById(R.id.btnOne);
        btnAnswer = findViewById(R.id.btnAnswer);
        btnDelete = findViewById(R.id.btnDelete);
        txtResult = findViewById(R.id.txtResult);
        btnReset = findViewById(R.id.btnReset);




    }
}