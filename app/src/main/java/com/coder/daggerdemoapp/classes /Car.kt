package com.coder.daggerdemoapp.classes

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine,val wheel: Wheel){
    private var TAG = "Car";
    fun drive() {
        Log.d(TAG, "driving....")
    }
}