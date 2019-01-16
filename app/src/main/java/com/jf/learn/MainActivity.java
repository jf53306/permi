package com.jf.learn;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import learn.jf.mypermissionanno.MyPermission;

@MyPermission({Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE})
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
