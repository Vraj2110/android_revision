package com.example.android_revision;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText taskinput = findViewById(R.id.etext1);
        Button saveButton = findViewById(R.id.btn1);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tasktext = taskinput.getText().toString().trim();

                if (tasktext.isEmpty()) {
                    android.widget.Toast.makeText(MainActivity.this, "please enter the task ",
                            Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    intent.putExtra("USER_TASK", tasktext);

                    startActivity(intent);


                }
            }

        });
    }
}