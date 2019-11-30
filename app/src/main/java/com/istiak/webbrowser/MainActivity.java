package com.istiak.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btnGo,btnFb,btnGoogle;
    EditText etxtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFb= findViewById(R.id.btn_fb);
        btnGo = findViewById(R.id.btn_go);
        btnGoogle = findViewById(R.id.btn_google);
        etxtUrl = findViewById(R.id.etxt_url);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=etxtUrl.getText().toString();
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);


            }
        });




        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);


            }
        });


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);


            }
        });
    }
}
