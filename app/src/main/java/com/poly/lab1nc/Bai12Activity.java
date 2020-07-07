package com.poly.lab1nc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bai12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai12);
        final Intent intent = new Intent(Bai12Activity.this, StudentService.class);
        Bundle bundle = new Bundle();
        bundle.putString("class", "PT15251MOB");
        bundle.putString("name", "twoSteps");
        bundle.putString("age", "24");
        bundle.putString("subject", "android");
        intent.putExtra("data", bundle);
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });
        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
    }
}
