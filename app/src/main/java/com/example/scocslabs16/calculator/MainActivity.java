package com.example.scocslabs16.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button add;
    private Button sub;
    private Button mul;
    private Button equal;
    private Button clear;
    private Button div;
    private TextView info;
    private TextView result;
    private  final  char ADDITION='+';
    private  final char   SUBTRACTION='-';
    private  final char MULTIPLICATION='*';
    private  final char DIVISION='/';
    private  final char EQU=0;
    private double  val1=Double.NaN;
    private  double val2;
private  char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '0');
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '1');
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '2');
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '3');
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '4');
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '5');
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '6');
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '7');
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '8');
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + '9');
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              compute();
              ACTION=ADDITION;
              result.setText(String.valueOf(val1) + '+');
              info.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(val1) + '-');
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1) + '*');
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1) + '/');
                info.setText(null);
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=EQU;
                result.setText(result.getText().toString() + String.valueOf(val2 ) +  '='  + String.valueOf(val1));


           info.setText(null);


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(info.getText().length() >0)
                {

                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                 else
                {
                  val1 = Double.NaN;
                  val2=Double.NaN;
                  info.setText(null);
                  result.setText(null);


                }
            }
        });

    }

    private void  setupUIView()
    {
        num1 =(Button)findViewById(R.id.button9);
        num2=(Button)findViewById(R.id.button8);
        num3 =(Button)findViewById(R.id.button7);
        num4=(Button)findViewById(R.id.button6);
        num5 =(Button)findViewById(R.id.button5);
        num6=(Button)findViewById(R.id.button4);
        num7 =(Button)findViewById(R.id.button3);
        num8=(Button)findViewById(R.id.button2);
        num9=(Button)findViewById(R.id.button);
        add=(Button)findViewById(R.id.button15);
        sub=(Button)findViewById(R.id.button16);
        mul=(Button)findViewById(R.id.button14);
        div=(Button)findViewById(R.id.button13);
        equal=(Button)findViewById(R.id.button12);
        info=(TextView) findViewById(R.id.tvControl);
        result=(TextView) findViewById(R.id.tvDisplay);
        clear=(Button) findViewById(R.id.button10);


    }

    private  void compute()
    {
      if(!Double.isNaN(val1))
      {
          val2=Double.parseDouble(info.getText().toString());


          switch (ACTION)
          {

              case ADDITION:
                  val1=val1+val2;
                  break;

              case SUBTRACTION:
                  val1=val1-val2;
                  break;

              case MULTIPLICATION:
                  val1=val1*val2;
                  break;
              case  DIVISION:
                  val1=val1/val2;
                  break;
              case EQU:
                  break;
          }


      }


      else
      {

          val1=Double.parseDouble(info.getText().toString());

      }



    }
}
