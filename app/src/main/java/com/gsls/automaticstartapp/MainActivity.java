package com.gsls.automaticstartapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "GT_";

    @RequiresApi(api = Build.VERSION_CODES.O_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "活动创建...");

       

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "活动销毁...");
        /**注销 unregisterReceiver()，否则可能引起内存泄露。*/
    }
}
