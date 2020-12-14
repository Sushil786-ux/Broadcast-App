package com.example.broad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction()))
        {
            Toast.makeText(context,"Airoplane Mode On",Toast.LENGTH_SHORT).show();
        }
        else if (Intent.ACTION_CAMERA_BUTTON.equals(intent.getAction())){
            Toast.makeText(context,"Camera Open",Toast.LENGTH_SHORT).show();
        }
    }
}
