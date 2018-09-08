package com.example.a59050083.assignment3;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
//implements View.OnClickListener
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    //declare data members
    private LinearLayout contentLayout;
    private LinearLayout buttonsLayout;
    private Button button1;
    private Button button2;
    //declare data members
    private ArrayList<TextView> employeeInfoViews; //ประกาศไว้ เอาไว้ทำอะไรทีหลัง
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutweek4);
        init();
    }
    private void init() {
        //get layout we want to insert dynamic views
        contentLayout = findViewById(R.id.contentLayout);
        //create buttons' layout
        buttonsLayout = new LinearLayout(this);
        buttonsLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(20, 10, 20, 100);
        buttonsLayout.setLayoutParams(layoutParams); //กว้างตามแม่ สูงตามคอนเทนต์
        //create button1
        button1 = new Button(this); // ใช้วิธี implement
        button1.setText("Button 1");
        button1.setOnClickListener(this);
        button1.setLayoutParams(new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        //add button1 into buttonsLayout
        buttonsLayout.addView(button1);
        //create button2
        button2 = new Button(this); //ทำแบบเดียวกับ bnt1
        button2.setText("Button 2");
        button2.setOnClickListener(this);
        button2.setLayoutParams(new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));//เหมือนกับ btn1
        //add button2 into buttonsLayout
        buttonsLayout.addView(button2);
        //add buttons' layout into contentLayout
        contentLayout.addView(buttonsLayout); //แอดไปยัง คอนเท็นเลเอ้า์ //จะได้ 2 ปุ่มด้านบน ที่มีความกว้าง wieth 1 เท่ากัน
        //------------------------------------------------------------------
        //create ArrayList of TextView
        employeeInfoViews = new ArrayList<>();
        TextView tv;
        for (int i = 1; i <= 20; i++){ //loop 20 ครั้งก็สร้าง textview 10 ครั้ง
            //create 20 TextViews
            tv = new TextView(this);
            tv.setTag("" + i);
            tv.setText("Employee " + i);
            tv.setGravity(Gravity.CENTER);
            tv.setPadding(10, 10, 10, 10);
            //set background color for odd and even TextViews
            if (i % 2 == 0){
                tv.setBackgroundColor(Color.parseColor("#aaddcc"));
            }
            else {tv.setBackgroundColor(Color.parseColor("#aaeecc"));
            }
            //create layoutParams for each TextView
            LinearLayout.LayoutParams lp = new
                    LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, 200);
            lp.setMargins(0, 0, 0, 0);
            tv.setLayoutParams(lp);
            //set OnClickListener for each TextView
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.setVisibility(View.GONE); //ทำให่มันหายไป ตอนกดจะทำให่มันหายไป ุ ถ้าใช้ inve ก็จะหายไป || อ้างถึง annoymous
                    //Toast.makeText(MainActivity.this,(TextView)v.getText(), Toast.LENGTH_LONG).show();
                    // () ใช้ เปลี่ยน v ให้เป็น textview เพราะ view เฉยๆ มันไม่มี ตัวหนังสือ
                }
            });
            //add TextView into contentLayout
            contentLayout.addView(tv); //แอดแต่ละตัวเข้า คอนเท็นวิวโดยตรง
            //add each TextView into ArrayList for reference back
            employeeInfoViews.add(tv); //แอดเข้า array เผื่อไว้
        }
    }
    //implements onClick()
    @Override
    public void onClick(View v) {
        if (v == button1){
            Toast.makeText(this, "Button1 clicked",
                    Toast.LENGTH_SHORT).show();
        }
        else if (v == button2){
            Toast.makeText(this, "Button2 clicked",
                    Toast.LENGTH_SHORT).show();
        }
    }
}