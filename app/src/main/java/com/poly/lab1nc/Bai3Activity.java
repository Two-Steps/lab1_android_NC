package com.poly.lab1nc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai3Activity extends AppCompatActivity {
    EditText edt_input, edt_count;
    Button btn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        edt_input = findViewById(R.id.edt_input);
        edt_count = findViewById(R.id.edt_count);
        btn_count = findViewById(R.id.btn_count);

        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = edt_input.getText().toString(),
                        count = edt_count.getText().toString();
                Intent intent = new Intent(Bai3Activity.this, CountService.class);
                Bundle bundle = new Bundle();
                bundle.putString("input", input);
                bundle.putString("count", count);
                intent.putExtra("dem", bundle);
                startService(intent);

            }
        });
    }
}
