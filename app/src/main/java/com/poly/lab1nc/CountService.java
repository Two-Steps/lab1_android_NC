package com.poly.lab1nc;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class CountService extends Service {
    public CountService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle bundle = intent.getBundleExtra("dem");
        String input = bundle.getString("input"),
                count = bundle.getString("count");
        int result = 0;
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, count, Toast.LENGTH_SHORT).show();

        if (bundle != null) {
            char t = count.charAt(0);
            for (int i = 0; i < input.length(); i++) {
                char kt = input.charAt(i);
                if (kt == t) {
                    result += 1;
                }
            }
            Toast.makeText(this, "Số ký tự: " + t + " trong chuỗi: " + input + " là: " + result, Toast.LENGTH_LONG).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Kết thúc", Toast.LENGTH_SHORT).show();
    }
}
