package com.example.activity_circlelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Circle Life
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Circle Life","Func onCreate" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Circle Life","Func onStart" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Circle Life","Func onPause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Circle Life","Func onStop" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Circle Life","Func onResume" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Circle Life","Func onDestroy" );
    }*/

    //Intent
    Button button;
   // EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();

        //EventClick
        EventClick();

    }

    private void Init(){
        button = (Button) findViewById(R.id.btn_Send);
        //editText = (EditText) findViewById(R.id.txt_text);
    }


    private void EventClick(){
        if(button == null) return;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetListen();
            }
        });
    }
    private void SetListen(){
        //String title = editText.getText().toString().trim();
        //Explicit Intent
        //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        //intent.putExtra("Key",title);
//        Bundle bdle = new Bundle();
//        bdle.putString("Key",title);
//        intent.putExtras(bdle);

        //Implicit Intent
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com"));
        startActivity(intent);
    }
}