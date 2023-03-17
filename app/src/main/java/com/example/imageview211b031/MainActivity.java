package com.example.imageview211b031;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isTrump = true;

    public void Change(View view){
        ImageView iv = findViewById(R.id.imageView3);
        if (isTrump) {
            iv.setImageResource(R.drawable.modi);
            isTrump=false;
        }else{
            iv.setImageResource(R.drawable.donald);
            isTrump=true;

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}