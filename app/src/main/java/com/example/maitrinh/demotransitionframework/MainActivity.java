package com.example.maitrinh.demotransitionframework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
	private String name = "";
	private String user = "hoa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		Log.d("Hello","code");
    }

    public void sayHello(){
        //some code write here
    }
}
