package com.example.nikkoekasaputra.quizramadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mulaiQuiz(View view){
        Intent s = new Intent(MainActivity.this, SoalActivity.class);
        startActivity(s);
    }

    public void about(View view){
        Intent a = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(a);
    }
}
