package com.example.android_revision;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        TextView DisplayTask = findViewById(R.id.txt1);

        String receivedTask = getIntent().getStringExtra("USER_TASK");

        if (receivedTask != null){
            DisplayTask.setText("Your Task:" + receivedTask);
        }
    }
}