package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import static com.example.androidactivitylifecycle.MainActivity.threadCounter;
public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.e("onCreate ------ ", "ActivityB: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        threadCounter = threadCounter + 1;
    }
    public void onFinishActivityB(View view)
    {
        Log.e("onFinishActivityB ", "ActivityB: onFinishActivityB()");
        finish();
    }
}