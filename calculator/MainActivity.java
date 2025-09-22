package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonadd, buttonsub, buttondot, buttonmul, buttondiv, buttonC, buttoneql;
    EditText result;
    float mvalueone, mvaluetwo;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        buttonadd = findViewById(R.id.btnPlus);
        buttonsub = findViewById(R.id.btnMinus);
        buttondot = findViewById(R.id.btnDot);
        buttonmul = findViewById(R.id.btnMul);
        buttondiv = findViewById(R.id.btnDiv);
        buttonC = findViewById(R.id.btnClear);
        buttoneql = findViewById(R.id.btnEqual);

        result = findViewById(R.id.display); // Your EditText id in XML is 'display'

        // Disable soft keyboard for EditText
        result.setShowSoftInputOnFocus(false);

        // Number buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Avoid multiple dots in number
                String currentText = result.getText().toString();
                if (!currentText.contains(".")) {
                    result.setText(currentText + ".");
                }
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    add = true;
                    result.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    sub = true;
                    result.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    mul = true;
                    result.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    mvalueone = Float.parseFloat(result.getText() + "");
                    div = true;
                    result.setText(null);
                }
            }
        });

        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    mvaluetwo = Float.parseFloat(result.getText() + "");

                    if (add) {
                        result.setText(mvalueone + mvaluetwo + "");
                        add = false;
                    } else if (sub) {
                        result.setText(mvalueone - mvaluetwo + "");
                        sub = false;
                    } else if (mul) {
                        result.setText(mvalueone * mvaluetwo + "");
                        mul = false;
                    } else if (div) {
                        if (mvaluetwo == 0) {
                            result.setText("Error");
                        } else {
                            result.setText(mvalueone / mvaluetwo + "");
                        }
                        div = false;
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                mvalueone = 0;
                mvaluetwo = 0;
                add = false;
                sub = false;
                mul = false;
                div = false;
            }
        });

    }
}
