package com.example.voyage_travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        getSupportActionBar().hide();

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3500);
                } catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(splashActivity.this , MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }



}