package com.example.gametictac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restart;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flagg=0,count= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        Button next;
        next= findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext= new Intent(MainActivity.this, Secondactivity.class);
                inext.putExtra("title","Home");
                inext.putExtra("name","Abubakar");
                inext.putExtra("Roll_No", 03);
                startActivity(inext);
            }
        });

    }
    public void Check(View view) {
        Button getvalue = (Button) view;
        count++;
        if(getvalue.getText().toString().equals("")){


        if (flagg == 0) {
            getvalue.setText("X");
            flagg = 1;
        } else {
            getvalue.setText("P");
            flagg = 0;
        }
        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            //Conditions
            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                //1
                Toast.makeText(this, "Winner" + b1, Toast.LENGTH_LONG).show();
                restart();
            } else if (b4.equals(b5) && b5.equals(b6) && !b5.equals("")) {
                //2
                Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_LONG).show();
                restart();
            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                //3
                Toast.makeText(this, "Winner is: " + b7, Toast.LENGTH_LONG).show();
                restart();

            } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")) {
                Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_LONG).show();
                restart();
                //4

            } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
                Toast.makeText(this, "Winner is: " + b2, Toast.LENGTH_LONG).show();
                restart();
                //4

            } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                //4
                Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_LONG).show();
                restart();

            } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")) {
                //4
                Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_LONG).show();
                restart();

            } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                //4
                Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_LONG).show();
                restart();

            }

        }
    }

    }
    public void restart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                flagg=0;
                count=0;

            }
        }, 4000);

    }
    public void restart(View v){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flagg=0;
        count=0;

    }
    // id initialize
    public void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        restart = findViewById(R.id.restart);

    }
}