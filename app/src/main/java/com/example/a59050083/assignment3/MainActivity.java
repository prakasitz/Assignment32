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

        bt1.setOnClickListener(this);
        tv1.setOnClickListener(this);
        et2.setOnClickListener(this);
        et1.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v instanceof  TextView && v.getId() == R.id.button) { // <--chk type view , (v.getId() == R.id.button) chk id layer
            Toast.makeText(this,"this is button",Toast.LENGTH_LONG).show();
        } else if(v.getId() == R.id.textView) {
            Toast.makeText(this,"this is textView",Toast.LENGTH_LONG).show();
        } else if(v.getId() == R.id.editText2) {
            Toast.makeText(this,"this is editText2",Toast.LENGTH_LONG).show();
        } else if(v instanceof EditText) {
            Toast.makeText(this,"this is editText1",Toast.LENGTH_LONG).show();
        }
    }
}