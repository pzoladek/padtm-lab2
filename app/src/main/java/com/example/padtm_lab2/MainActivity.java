package com.example.padtm_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lab2", "metoda oncreate");
        Toast.makeText(this, "hej lab2 - oncreate", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lab2", "metoda onresume");
        Toast.makeText(this, "hej lab2 - onresume", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lab2", "metoda onstart");
        Toast.makeText(this, "hej lab2 - onstart", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lab2", "metoda onpause");
        Toast.makeText(this, "hej lab2 - onpause", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lab2", "metoda onstop");
        Toast.makeText(this, "hej lab2 - onstop", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lab2", "metoda ondestroy");
        Toast.makeText(this, "hej lab2 - ondestroy", Toast.LENGTH_SHORT);
    }
}
