package com.poly.lab1nc;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class StudentService extends Service {
    public StudentService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle bundle = intent.getBundleExtra("data");
        String Cclass = bundle.getString("class");
        String name = bundle.getString("name");
        String age = bundle.getString("age");
        String subject = bundle.getString("subject");
        if (bundle != null) {
            Toast.makeText(this, "Họ tên: " + name + "\n" + "Tuổi: " + age + "\n"
                    + "Lớp: " + Cclass + "\n" + "Môn học: " + subject, Toast.LENGTH_SHORT).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Đã dừng service", Toast.LENGTH_SHORT).show();
    }
}
