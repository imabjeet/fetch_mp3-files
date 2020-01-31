package com.example.beetonz_designer.mp3cutterandringtonemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mp3Cutter(View view)
    {
        startActivity(new Intent(MainActivity.this,Mp3List.class));
    }

    public void audioMerger(View view)
    {

    }

    public void audioMixer(View view)
    {

    }

    public void contacts(View view)
    {

    }

    public void output(View view)
    {

    }

    public void music(View view)
    {

    }
}
