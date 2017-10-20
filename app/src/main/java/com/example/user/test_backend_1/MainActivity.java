package com.example.user.test_backend_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startUserrActivity();
    }

    public void startUserrActivity() {
        startActivity(new Intent(this, UserActivity.class));
    }

}
