package com.example.a59050083.assignment3;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
//implements View.OnClickListener
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    LinearLayout  loginLayout;
    EditText inputUse;
    EditText inputPass;
    Button btLogin;
    LinearLayout loginMessageLayout;
    TextView tvLoginMessage;
    Button btBack;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutweek4);

        loginLayout = findViewById(R.id.loginLayout);
        inputUse = findViewById(R.id.etUsername);
        inputPass = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);

        loginMessageLayout = findViewById(R.id.loginMessageLayout);
        btBack = findViewById(R.id.btBack);
        tvLoginMessage = findViewById(R.id.tvLoginMessage);
        btBack.setOnClickListener(this);

    }
    @Override
    public void onClick (View v) {
        if(v == btLogin) {
            boolean isLoginSuc;
            if(inputUse.getText().toString().equals("admin")
                    && inputPass.getText().toString().equals("1234")) {
                isLoginSuc = true;
            } else {
                isLoginSuc = false;
            }
            loginLayout.setVisibility(View.GONE);
            if(isLoginSuc) {
                tvLoginMessage.setTextColor(Color.parseColor("#00ff00"));
                tvLoginMessage.setText("Success");
            } else {
                tvLoginMessage.setTextColor(Color.parseColor("#ff0000"));
                tvLoginMessage.setText("Fail");
            }
            loginMessageLayout.setVisibility(View.VISIBLE);
        } else if(v == btBack) {
            loginLayout.setVisibility(View.VISIBLE);
            loginMessageLayout.setVisibility(View.GONE);
        }
    }
}