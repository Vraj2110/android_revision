package com.example.android_revision;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"OnCreated called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStarted called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPaused called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"OnStopped called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestarted called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnDestroyed called");
    }
}
