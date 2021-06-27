package com.example.lifecycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button mbtnLaunchThirdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mbtnLaunchThirdActivity = findViewById(R.id.btnLaunchThirdActivity);
        mbtnLaunchThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent( SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        Log.d("SecondActivity","OnCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity","OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity","OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SecondActivity","OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity","OnResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","OnDestroy");
    }
}