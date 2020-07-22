package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnTinh;
    EditText ST1, ST2;
    TextView txtHT;
    RadioButton rbtnCong, rbtnTru, rbtnNhan, rbtnChia;
    boolean flag = false;
    String a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = "";
        b = "";
        txtHT=(TextView)findViewById(R.id.txtHT);
        ST1=(EditText)findViewById(R.id.ST1);
        ST2=(EditText)findViewById(R.id.ST2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnTinh=(Button)findViewById(R.id.btnTinh);
        rbtnCong=(RadioButton)findViewById(R.id.rbtnCong);
        rbtnTru=(RadioButton)findViewById(R.id.rbtnTru);
        rbtnNhan=(RadioButton)findViewById(R.id.rbtnNhan);
        rbtnChia=(RadioButton)findViewById(R.id.rbtnChia);
        ST1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
            }
        });

        ST1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = true;
                }
            }
        });

        ST2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
            }
        });

        ST2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = false;
                }
            }
        });
    }


    public void so1(View v)
    {
        if (flag) {
            a += btn1.getText().toString();
            ST1.setText(a);
        } else {
            b += btn1.getText().toString();
            ST2.setText(b);
        }
    }
    public void so2(View v)
    {
        if (flag) {
            a += btn2.getText().toString();
            ST1.setText(a);
        } else {
            b += btn2.getText().toString();
            ST2.setText(b);
        }
    }
    public void so3(View v)
    {
        if (flag) {
            a += btn3.getText().toString();
            ST1.setText(a);
        } else {
            b += btn3.getText().toString();
            ST2.setText(b);
        }
    }
    public void so4(View v)
    {
        if (flag) {
            a += btn4.getText().toString();
            ST1.setText(a);
        } else {
            b += btn4.getText().toString();
            ST2.setText(b);
        }
    }
    public void so5(View v)
    {
        if (flag) {
            a += btn5.getText().toString();
            ST1.setText(a);
        } else {
            b += btn5.getText().toString();
            ST2.setText(b);
        }
    }
    public void so6(View v)
    {
        if (flag) {
            a += btn6.getText().toString();
            ST1.setText(a);
        } else {
            b += btn6.getText().toString();
            ST2.setText(b);
        }
    }
    public void so7(View v)
    {
        if (flag) {
            a += btn7.getText().toString();
            ST1.setText(a);
        } else {
            b += btn7.getText().toString();
            ST2.setText(b);
        }
    }
    public void so8(View v)
    {
        if (flag) {
            a += btn8.getText().toString();
            ST1.setText(a);
        } else {
            b += btn8.getText().toString();
            ST2.setText(b);
        }
    }
    public void so9(View v)
    {
        if (flag) {
            a += btn9.getText().toString();
            ST1.setText(a);
        } else {
            b += btn9.getText().toString();
            ST2.setText(b);
        }
    }
    public void so0(View v)
    {
        if (flag) {
            a += btn0.getText().toString();
            ST1.setText(a);
        } else {
            b += btn0.getText().toString();
            ST2.setText(b);
        }
    }



    public void display(View v){
        Double a = Double.parseDouble(ST1.getText().toString());
        Double b = Double.parseDouble(ST2.getText().toString());
        Double s;
        if (rbtnCong.isChecked() == true)
            s = a + b;
        else if (rbtnTru.isChecked() == true)
            s= a-b;
        else if (rbtnNhan.isChecked() == true)
            s= a*b;
        else
            s= a/b;
        txtHT.setText(String.valueOf(s));
    }

    public void reset(View view){
        a="";
        b="";
        ST1.setText("");
        ST2.setText("");
    }


    public void exit(View view) {
        System.exit(0);
    }
}
