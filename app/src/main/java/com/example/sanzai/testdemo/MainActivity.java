package com.example.sanzai.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private String sss = "sss";

    private String fff = "ffffff";

    private String ccc = "ccc";

    private String ddd = "ddd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate: ");
        Log.e("TAG", "onCreate: ");
    }
}
