package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private Button bmich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.editText);
        weight = findViewById(R.id.editText2);
        bmich = findViewById(R.id.button);

        bmich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                Bundle bundle =new Bundle();
                bundle.putString("height",height.getText().toString());
                bundle.putString("width",weight.getText().toString());
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }
}
