package com.example.jihcstudy_lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public
class MainActivity extends AppCompatActivity {
    Button btn_mc,btn_m_plus,btn_m_minus,btn_mr;
    Button btn_c,btn_div,btn_mul,btn_del;
    Button btn7,btn8,btn9,btn_minus;
    Button btn4,btn5,btn6,btn_plus;
    Button btn1,btn2,btn3,btn_eq;
    Button btn_per,btn0,btn__comma;
    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        btn_mc = findViewById ( R.id.btn_mc );
        btn_m_plus = findViewById ( R.id.btn_mplus );
        btn_m_minus = findViewById ( R.id.btn_mminus );
        btn_mr = findViewById ( R.id.btn_mr );

        btn_c = findViewById ( R.id.btn_c);
        btn_div = findViewById ( R.id.btn_div);
        btn_mul = findViewById ( R.id.btn_mult);
        btn_del = findViewById ( R.id.btn_del);

        btn7 = findViewById ( R.id.btn_7);
        btn8 = findViewById ( R.id.btn_8);
        btn9 = findViewById ( R.id.btn_9);
        btn_minus = findViewById ( R.id.btn_minus);

        btn4 = findViewById ( R.id.btn_4);
        btn5 = findViewById ( R.id.btn_5);
        btn6 = findViewById ( R.id.btn_6);
        btn_plus = findViewById ( R.id.btn_plus);

        btn1 = findViewById ( R.id.btn_1);
        btn2 = findViewById ( R.id.btn_2);
        btn3 = findViewById ( R.id.btn_3);
        btn_eq = findViewById ( R.id.btn_eq);

        btn_per = findViewById ( R.id.btn_per);
        btn0 = findViewById ( R.id.btn_0);
        btn__comma = findViewById ( R.id.btn_comma);

        number = findViewById ( R.id.number );

        View.OnClickListener btnNumbers = new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String numberBefore = number.getText ().toString ();
                String clickedBtn = "";
                String result = "";
                switch (v.getId()){
                    case R.id.btn_1:
                        clickedBtn = "1";
                        break;
                    case R.id.btn_2:
                        clickedBtn = "2";
                        break;
                    case R.id.btn_3:
                        clickedBtn = "3";
                        break;
                    case R.id.btn_4:
                        clickedBtn = "4";
                        break;
                    case R.id.btn_5:
                        clickedBtn = "5";
                        break;
                    case R.id.btn_6:
                        clickedBtn = "6";
                        break;
                    case R.id.btn_7:
                        clickedBtn = "7";
                        break;
                    case R.id.btn_8:
                        clickedBtn = "8";
                        break;
                    case R.id.btn_9:
                        clickedBtn = "9";
                        break;
                    case R.id.btn_0:
                        clickedBtn = "0";
                        break;
                }
                if(numberBefore .equals ( "0" )) result = numberBefore + clickedBtn;
                else result = clickedBtn;
                    number.setText ( result );


            }
        };

        btn7.setOnClickListener ( btnNumbers);
        btn8.setOnClickListener (btnNumbers);
        btn9.setOnClickListener ( btnNumbers );
        btn4.setOnClickListener ( btnNumbers);
        btn5.setOnClickListener (btnNumbers);
        btn6.setOnClickListener ( btnNumbers );
        btn1.setOnClickListener ( btnNumbers);
        btn2.setOnClickListener (btnNumbers);
        btn3.setOnClickListener ( btnNumbers );
        btn0.setOnClickListener ( btnNumbers);

        View.OnClickListener btnOther = new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                switch (v.getId ()) {
                    case R.id.btn_del:
                        number.setText ( "0" );
                        break;

                    case R.id.btn_mminus:
                        String numText = number.getText().toString ();
                        int num = Integer.parseInt ( numText );
                        if (num > 0 ) number.setText ( "-" + numText);
                        break;

                    case R.id.btn_mplus:
                        String numText1 = number.getText().toString ();
                        int num1 = Integer.parseInt ( numText1 );
                        if (num1 < 0 ) number.setText ( "+" + numText1);
                        break;

                }

            }
        };
    }
}