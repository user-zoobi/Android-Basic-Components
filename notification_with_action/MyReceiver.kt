package com.tcf.aesthethics.ui

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.tcf.aesthethics.extensions.toast

class MyReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val message = intent?.getStringExtra("MESSAGE")
        if (!message.isNullOrEmpty()){
            toast(context,"Clicked...")
        }
    }
}