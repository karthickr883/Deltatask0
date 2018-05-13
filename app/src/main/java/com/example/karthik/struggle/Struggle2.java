package com.example.karthik.struggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Struggle2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struggle2);

        LinearLayout l = (LinearLayout) findViewById(R.id.rootView);
        TextView t = new TextView(this);
        l.addView(t);
        ArrayList<String> numbers = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i, "one");
        }
        for (int j = 0; j < 10; j++){
            t.setText(numbers.get(j));
        }
    }
}