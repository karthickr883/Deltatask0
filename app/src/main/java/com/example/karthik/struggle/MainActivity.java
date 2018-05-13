package com.example.karthik.struggle;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

import static android.R.attr.id;
import static android.support.annotation.IdRes.*;
import static com.example.karthik.struggle.R.layout.activity_main;
import static com.example.karthik.struggle.R.layout.activity_struggle2;
import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity { String [] str = new String[50];
    int k=0;
    int x=1;int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);



        final String [] stone = new String[6];
        stone [0] = "Powerstone";
        stone [1] = "Spacestone";
        stone [2] = "Timestone";
        stone [3] = "Realitystone";
        stone [4] = "Soulstone";
        stone [5] = "Mindstone";
        final TextView t = (TextView) findViewById(R.id.textView1);
       final TextView t1 = (TextView) findViewById(R.id.textView);
        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {flag=0;
                if (x==6)
                    Toast.makeText(MainActivity.this,"You have obtained all 6 stones",Toast.LENGTH_SHORT).show();


                else {
                    Random random = new Random();

                    str[k] = stone[random.nextInt(6)];
                    if(k!=0&&str[k]==str[k-1])
                        t.setText("You have got a " + str[k]+" again consecutively");
else


                    t.setText("You have got a " + str[k]);
                    if (str[k] == "Powerstone")
                        t.setBackgroundColor(Color.parseColor("#800080"));
                    else if (str[k] == "Soulstone")
                        t.setBackgroundColor(Color.parseColor("#FFA500"));
                    else if (str[k] == "Timestone")
                        t.setBackgroundColor(Color.GREEN);
                    else if (str[k] == "Mindstone")
                        t.setBackgroundColor(Color.parseColor("#FFFFF0"));
                    else if (str[k] == "Realitystone")
                        t.setBackgroundColor(Color.RED);
                    else if (str[k] == "Spacestone")
                        t.setBackgroundColor(Color.BLUE);



                    if (k == 0)
                        t1.append("\n " + 1 + ". " + str[k]);
                    else {
                        for (int i = 0; i < k; i++) {
                            if (str[k] == str[k - i - 1])
                                flag++;
                        }
                        if (flag == 0) {
                            int m = x + 1;
                            t1.append("\n " + m + ". " + str[k]);
                            x++;

                        }
                    }
                    k++;

                }
            }
        });
    }

    }
