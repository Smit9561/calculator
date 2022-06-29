package com.mastersmiple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, btn3, b4, b5, b6, b7, b8, b9, add, equ, point, sub, mul, diVis, parSan, delete, ac;
    TextView txt, txtOutput;
    String data;
    int f_name;
    int s_name;
    char op = '+';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutput = findViewById(R.id.txtOutput);
        txt = findViewById(R.id.txt);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        add = findViewById(R.id.add);
        equ = findViewById(R.id.equ);
        point = findViewById(R.id.point);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        diVis = findViewById(R.id.diVis);
        parSan = findViewById(R.id.parSan);
        delete = findViewById(R.id.delete);
        ac = findViewById(R.id.ac);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old = txt.getText().toString();
                txt.setText(old + ".");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_name = 0;
                s_name = 0;
                txt.setText("");

            }
        });
        diVis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = '/';
                f_name = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        parSan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = '%';
                f_name = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = '*';

                f_name = Integer.parseInt(txt.getText().toString());

                txt.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = '+';

                f_name = Integer.parseInt(txt.getText().toString());
                data=txt.getText().toString();

                txt.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='-';
                f_name =Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s_name = Integer.parseInt(txt.getText().toString());
                data=txt.getText().toString();

                if (op == '+') {
                    data=txt.getText().toString();
                    txt.setText("" +(f_name + s_name));
                } else if (op == '*') {
                    txt.setText("" + (f_name * s_name));
                } else if (op == '/') {
                    txt.setText("" + (f_name / s_name));
                }else if (op == '%') {
                    txt.setText("" + ((f_name * s_name)/100));
                }else if(op == '-'){
                    txt.setText((""+(f_name - s_name)));
                }
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = txt.getText().toString();
                txt.setText(data + "0");
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old = txt.getText().toString();
                txt.setText(old + "1");
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old = txt.getText().toString();
                txt.setText(old + "2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old = txt.getText().toString();
                txt.setText(old + "3");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String old = txt.getText().toString();
                txt.setText(old + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txt.getText().toString();
                txt.setText(old + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txt.getText().toString();
                txt.setText(old + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txt.getText().toString();
                txt.setText(old + "7");
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txt.getText().toString();
                txt.setText(old + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = txt.getText().toString();
                txt.setText(old + "9");
            }
        });


    }
}