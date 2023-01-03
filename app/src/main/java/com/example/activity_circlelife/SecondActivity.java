package com.example.activity_circlelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Init();
        GetValue(getIntent());
        GetValue(getIntent());
    }

    private void GetValue(Intent intent) {
        Bundle ble = intent.getExtras();
        String title = ble.getString("Key");
        textView.setText(title);
    }

    private void Init(){
        textView = (TextView) findViewById(R.id.txt_text1);
    }

}