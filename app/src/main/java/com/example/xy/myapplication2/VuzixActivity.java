package com.example.xy.myapplication2;

import android.app.Activity;
import android.os.Bundle;

import com.example.xy.utils.Log;
import com.vuzix.speech.MainActivity;

public class VuzixActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LOG_TAG", "onCreate");
    }

}
