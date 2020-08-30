package com.ancalc.blueeye.andrcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView top_view,bottom_view;
    Button b_zero,b_one,b_two,b_three,b_four,b_five,b_six,b_seven,b_eight,b_nine,
            b_plus,b_minus,b_mul,b_div,b_eql,b_plusmin,b_perctg,b_dot,b_del,b_clear,rootbtn,piebtn,factbtn,powerbtn;
    double firstNum,secondNum,result;
    String operations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_view=(TextView) findViewById(R.id.top_text);
        bottom_view=(TextView) findViewById(R.id.botton_text);

        b_zero=(Button) findViewById(R.id.zero_btn);
        b_one=(Button) findViewById(R.id.one_btn);
        b_two=(Button) findViewById(R.id.two_btn);
        b_three=(Button) findViewById(R.id.three_btn);
        b_four=(Button) findViewById(R.id.four_btn);
        b_five=(Button) findViewById(R.id.five_btn);
        b_six=(Button) findViewById(R.id.six_btn);
        b_seven=(Button) findViewById(R.id.seven_btn);
        b_eight=(Button) findViewById(R.id.eight_btn);
        b_nine=(Button) findViewById(R.id.nine_btn);
        b_plus=(Button) findViewById(R.id.plus_btn);
        b_minus=(Button) findViewById(R.id.minus_btn);
        b_mul=(Button) findViewById(R.id.mul_btn);
        b_div=(Button) findViewById(R.id.div_btn);
        b_dot=(Button) findViewById(R.id.dot_btn);
        b_eql=(Button) findViewById(R.id.equal_btn);
        b_plusmin=(Button) findViewById(R.id.plusmin_btn);
        b_clear=(Button) findViewById(R.id.clear_btn);
        b_del=(Button) findViewById(R.id.del_btn);
        b_perctg=(Button) findViewById(R.id.percge_btn);

        rootbtn=(Button) findViewById(R.id.root_btn);
        piebtn=(Button) findViewById(R.id.pie_btn);
        powerbtn=(Button) findViewById(R.id.power_btn);
        factbtn=(Button) findViewById(R.id.fact_btn);

        rootbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                String temp=bottom_view.getText() + "\u221a";
                top_view.setText(temp+" ");
                double rs=Math.sqrt(firstNum);
                String answer=String.format("%.4f",rs);
                bottom_view.setText(" = " + answer);
            }
        });
        piebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"3.14159";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        powerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                bottom_view.setText("");
                operations="^";
                top_view.setText(firstNum + " " + operations);
            }
        });
        factbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i,fact=1;
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                for(i=1;i<=firstNum;i++){
                    fact=fact*i;
                }
                double rs=fact;
                String temp=bottom_view.getText() + "!";
                top_view.setText(temp+" ");
                String answer=String.format("%.2f",rs);
                bottom_view.setText(" = " + answer);
            }
        });

        b_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"0";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"1";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"2";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"3";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"4";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"5";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"6";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"7";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"8";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+"9";
                bottom_view.setText(temp);
                top_view.setText(temp+" ");
            }
        });
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                bottom_view.setText("");
                operations="+";
                top_view.setText(firstNum + " " + operations);
            }
        });
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                bottom_view.setText("");
                operations="-";
                top_view.setText(firstNum + " " + operations);
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                bottom_view.setText("");
                operations="\u00d7";
                top_view.setText(firstNum + " " + "\u00d7");
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                bottom_view.setText("");
                operations="\u00f7";
                top_view.setText(firstNum + " " + "\u00f7");
            }
        });
        b_plusmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                firstNum=firstNum*(-1);
                top_view.setText(firstNum+" ");
                bottom_view.setText(firstNum+" ");
            }
        });
        b_perctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.parseDouble(bottom_view.getText().toString());
                bottom_view.setText("");
                operations="%";
                top_view.setText(firstNum + " " + operations);
            }
        });
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=bottom_view.getText()+".";
                bottom_view.setText(temp);
                top_view.setText(temp);
            }
        });
        b_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace=null;
                if(bottom_view.getText().length()>0)
                {
                    StringBuilder str=new StringBuilder(bottom_view.getText());
                    str.deleteCharAt(bottom_view.getText().length()-1);
                    backspace=str.toString();
                    bottom_view.setText(backspace);
                    top_view.setText(backspace);
                }
            }
        });
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottom_view.setText("");
                top_view.setText("");
            }
        });
        b_eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer;
                secondNum=Double.parseDouble(bottom_view.getText().toString());
                top_view.setText(firstNum + " " + operations + " " + secondNum);
                if(operations=="+")
                {
                    result=firstNum+secondNum;
                    answer=String.format("%.2f",result);
                    bottom_view.setText(answer);
                }
                else if(operations=="^")
                {
                    result=Math.pow(firstNum,secondNum);
                    answer=String.format("%.2f",result);
                    bottom_view.setText(answer);
                }
                else if(operations=="-")
                {
                    result=firstNum-secondNum;
                    answer=String.format("%.2f",result);
                    bottom_view.setText(answer);
                }
                else if(operations=="\u00d7")
                {
                    result=firstNum*secondNum;
                    answer=String.format("%.2f",result);
                    bottom_view.setText(answer);
                }
                else if(operations=="\u00f7")
                {
                    result=firstNum/secondNum;
                    answer=String.format("%.2f",result);
                    bottom_view.setText(answer);
                }
                else if(operations=="%")
                {
                    result=(firstNum*secondNum)/100;
                    answer=String.format("%.2f",result);
                    bottom_view.setText(answer);
                }
            }
        });
    }
}
