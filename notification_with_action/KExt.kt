package com.tcf.aesthethics.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import androidx.viewbinding.ViewBinding


fun <T : ViewBinding> Activity.viewBinding(factory: (LayoutInflater) -> T) =
    lazy(LazyThreadSafetyMode.NONE) { factory(layoutInflater) }

fun gotoActivity( context: Context, activity: Class<*>){
    val intent = Intent(context, activity)
    context.startActivity(intent)
}

fun toast(context: Context,message:String){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

