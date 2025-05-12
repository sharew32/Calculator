package com.sharew.calculator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textView = findViewById(R.id.about_info);
        textView.setText("Developer: Sharew Endeshaw\nPhone: +251920773334\nEmail: sharewendeshw8@gmail.com\nTelegram:@sharew32");
    }
}
