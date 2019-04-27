package com.trabajo.activity_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        et = (EditText) findViewById(R.id.et);
        if (Intent.ACTION_SEND.equals(action) && type != null) {
            String extraText = intent.getStringExtra(Intent.EXTRA_TEXT);
            if (extraText != null) {
                et.setText(extraText);
            }
        }
    }
}
