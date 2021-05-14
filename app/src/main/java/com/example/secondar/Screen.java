package com.example.secondar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen extends AppCompatActivity {
    private Button idexplore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

//        public void ClickHome(View Object v;
//        v)
//        {
//            idexplore = (Button)findViewById(R.id.idexplore);
//            Intent intent = new Intent(Screen.this, HomePage.class);
//            startActivity(intent);
        Button idexplore = (Button) findViewById(R.id.idexplore);
            idexplore.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent intent = new Intent(Screen.this, HomePage.class);
                    startActivity(intent);

                }
            });

    }
};