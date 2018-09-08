package com.example.a59050083.assignment3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //step 1: declare
    private TextView tv1;
    private EditText et1;
    private EditText et2;
    private ImageView iv1;
    private  ImageView iv2;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutweek4);
        //step 2: binding data member-view
        iv1 = findViewById(R.id.imageView);
        iv2 = findViewById(R.id.imageView2);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        bt1 = findViewById(R.id.button);
        tv1 = findViewById(R.id.textView);

        bt1.setOnClickListener(new View.OnClickListener() { //click and show toast
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();

                String a = et1.getText().toString();
                tv1.setText(a);
                tv1.setTextColor(Color.parseColor("#00ff00"));
                iv1.setImageResource(R.drawable.mpl269);
            }
        });

        bt1.setOnClickListener(this);

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                tv1.setText(s.toString());
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v instanceof  Button) {
            Toast.makeText(MainActivity.this,"this is button",Toast.LENGTH_LONG).show();
        } else if(v instanceof TextView) {
            Toast.makeText(this,"this is textiview",Toast.LENGTH_LONG).show();
        }
    }
}