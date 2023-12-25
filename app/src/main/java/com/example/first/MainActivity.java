package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonid);
        textView = findViewById(R.id.textViewid);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            textView.setText("Hi,i am Pronob. I am an android developer.");
                            Intent intent = new Intent(MainActivity.this,NewActivity.class);

                            startActivity(intent);
                    }
            });
        }
}