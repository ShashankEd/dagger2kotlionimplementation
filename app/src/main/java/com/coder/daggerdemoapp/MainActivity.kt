package com.coder.daggerdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coder.daggerdemoapp.classes.Car
import com.coder.daggerdemoapp.classes.CarComponent
import com.coder.daggerdemoapp.classes.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        crateCar();
    }
    private fun crateCar() {
        //get the dependencies done through dagger component for the
        //car component interface
        var  obj:CarComponent = DaggerCarComponent.builder()
            .build();
        //get the instance of car from the getCar defined in the interface
        car = obj.getCar();
        //call the drive method, we must notice that we haven't instantiated the Car
        //or wheel or engine, the dagger component has taken care of that
        car.drive();

    }
}