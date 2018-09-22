package com.example.priya_000.sendbroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendOutBroadcast(View view){
        Intent i=new Intent();      //it doesnt have another screen thats gonna come it will just broadcast a msg to anone who is listening
                                    // thats why we do not need to give the class inside the braces unlike the previous one
        i.setAction("com.example.priya_000.sendbroadcast");  //to listen to only this broadcast
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);  //to insure that the intent broadcast is compatible with all versions of android
        sendBroadcast(i);

    }
}
