package com.example.lifecycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnLaunchSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLaunchSecondActivity = findViewById(R.id.btnLaunchSecondActivity);
        mBtnLaunchSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                startActivity(intent);
            }
        });
        Log.d("MainActivity","OnCrete");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","OnResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","OnDestroy");
    }
}