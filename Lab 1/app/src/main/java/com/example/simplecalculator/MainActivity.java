package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub, btnDiv, btnMul, btnClr, btnEql, btnDec;

    TextView display;
    boolean firstTouch = true;


    double val1, val2;
//    boolean add, sub, mul, div;

    enum Operator {none, add, minus, multiply, divide}
    Operator optr = Operator.none;

    public  double getResult (double num1, double num2){
        if (optr== Operator.add){
            val1 = num1+num2;
            return val1;
        }
        else if (optr== Operator.minus){
            val1 = num1-num2;
            return val1;
        }
        else if (optr== Operator.divide){
            val1 = num1/num2;
            return val1;
        }
        else if (optr== Operator.multiply){
            val1 = num1*num2;
            return val1;
        }
        return 0;
    }
    // This methods strips unnecessary decimal point
    public String trimResult(String resultText){
        if (resultText.substring(resultText.length() - 2, resultText.length()).equals(".0")) {
            resultText = resultText.substring(0, resultText.length()-2);
        }
        return resultText;
    }
    public boolean  getNegativeNumber(String number) {
        number = Double.toString(val1-Double.parseDouble(number));
        number = trimResult(number);
        display.setText(number);
        firstTouch=false;
        optr= Operator.none;
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.resultEdit);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnClr = findViewById(R.id.btnClr);
        btnEql = findViewById(R.id.btnEql);
        btnDec = findViewById(R.id.btnDec);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "0");
                else {
                    if (optr == Operator.minus&& val1==0 && val2==0) {
                        getNegativeNumber("0");
                        return;
                    }
                    display.setText("0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "1");
                else {
                    if (optr == Operator.minus && val1==0&& val2==0) {
                        getNegativeNumber("1");
                        return;
                    }
                    display.setText("1");
                    firstTouch=false;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "2");
                else {
                    if (optr == Operator.minus&& val1==0&& val2==0) {
                        getNegativeNumber("2");
                        return;
                    }
                    display.setText("2");
                    firstTouch=false;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "3");
                else {
                    if (optr == Operator.minus&& val1==0&&val2==0) {
                        getNegativeNumber("3");
                        return;
                    }
                    display.setText("3");
                    firstTouch=false;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "4");
                else {
                    if (optr == Operator.minus&& val1==0&&val2==0) {
                        getNegativeNumber("4");
                        return;
                    }
                    display.setText("4");
                    firstTouch=false;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "5");
                else {
                    if (optr == Operator.minus&& val1==0&&val2==0) {
                        getNegativeNumber("5");
                        return;
                    }
                    display.setText("5");
                    firstTouch=false;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "6");
                else {
                    if (optr == Operator.minus&& val1==0&&val2==0) {
                        getNegativeNumber("6");
                        return;
                    }
                    display.setText("6");
                    firstTouch=false;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "7");
                else {
                    if (optr == Operator.minus&& val1==0&&val2==0) {
                        getNegativeNumber("7");
                        return;
                    }
                    display.setText("7");
                    firstTouch=false;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "8");
                else {
                    if (optr == Operator.minus&&val1==0&&val2==0) {
                        getNegativeNumber("8");
                        return;
                    }
                    display.setText("8");
                    firstTouch=false;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstTouch) display.setText(display.getText() + "9");
                else {
                    if (optr == Operator.minus && val1==0&&val2==0) {
                        getNegativeNumber("9");
                        return;
                    }
                    display.setText("9");
                    firstTouch=false;
                }
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The verification is to prevent user from typing two consecutive dots
                if (display.getText().charAt(display.getText().length()-1)!='.' && !firstTouch) {
                    display.setText(display.getText() + ".");
                    firstTouch=false;
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (optr==Operator.none) {
                    val1 = Double.parseDouble((String) display.getText());
                    display.setText("");
                    optr = Operator.add;
                    return;
                }
                else {
                    if (display.getText()==""|| firstTouch) {
                        optr= Operator.add;
                        return;
                    }

                    val2 = Double.parseDouble((String) display.getText());
                    double result;

                    result= getResult(val1, val2);

                    String resultText = Double.toString(result);
                    if (resultText.substring(resultText.length() - 2, resultText.length()).equals(".0")) {
                        resultText = resultText.substring(0, resultText.length()-2);
                    }

                    display.setText(resultText);
                    val2=0;
                    firstTouch = true;
                    optr = Operator.add;
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (optr==Operator.none) {
                    val1 = Double.parseDouble((String) display.getText());
                    display.setText("");
                    optr = Operator.minus;
                    return;
                }
                else {
                    if (display.getText()=="" || firstTouch) {
                        optr= Operator.minus;
                        return;
                    }

                    val2 = Double.parseDouble((String) display.getText());
                    double result;

                    result= getResult(val1, val2);

                    String resultText = Double.toString(result);
                    resultText = trimResult(resultText);

                    display.setText(resultText);
                    val2=0;
                    firstTouch = true;
                    optr = Operator.minus;
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (optr==Operator.none) {
                    val1 = Double.parseDouble((String) display.getText());
                    display.setText("");
                    optr = Operator.divide;
                    return;
                }
                else {
                    if (display.getText()==""||firstTouch) {
                        optr= Operator.divide;
                        return;
                    }

                    val2 = Double.parseDouble((String) display.getText());
                    double result;

                    result= getResult(val1, val2);

                    String resultText = Double.toString(result);
                    resultText = trimResult(resultText);

                    display.setText(resultText);
                    val2=0;
                    firstTouch = true;
                    optr = Operator.divide;
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (optr==Operator.none) {
                    val1 = Double.parseDouble((String) display.getText());
                    display.setText("");
                    optr = Operator.multiply;
                    return;
                }
                else {
                    if (display.getText()==""||firstTouch) {
                        optr= Operator.multiply;
                        return;
                    }

                    val2 = Double.parseDouble((String) display.getText());
                    double result;

                    result= getResult(val1, val2);

                    String resultText = Double.toString(result);
                    resultText = trimResult(resultText);

                    display.setText(resultText);
                    val2=0;
                    firstTouch = true;
                    optr = Operator.multiply;
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (optr==Operator.add){
                    if (display.getText()==""){

                    }
                    else {
                        val2 = Double.parseDouble((String) display.getText());

                        String resultText = Double.toString(val1+val2);

                        resultText = trimResult(resultText);

                        display.setText(resultText);
                    }
                }
                else if (optr==Operator.minus) {
                    val2 = Double.parseDouble((String) display.getText());

                    String resultText = Double.toString(val1-val2);

                    resultText = trimResult(resultText);

                    display.setText(resultText);

                }
                else if (optr==Operator.divide){
                    val2 = Double.parseDouble((String) display.getText());

                    String resultText = Double.toString(val1/val2);

                    resultText = trimResult(resultText);
                    display.setText(resultText);

                }
                else if (optr==Operator.multiply){
                    val2 = Double.parseDouble((String) display.getText());

                    String resultText = Double.toString(val1*val2);

                    resultText = trimResult(resultText);

                    display.setText(resultText);

                }
                else
                {
                    double result = Double.parseDouble(display.getText().toString());
                    val1= result;

                    display.setText(trimResult(Double.toString(val1)));
                }
                optr = Operator.none;
                val2 = 0;
                firstTouch = true;
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("0");
                val2=0;
                val1=0;
                optr=Operator.none;
                firstTouch = true;
            }
        });
    }
}