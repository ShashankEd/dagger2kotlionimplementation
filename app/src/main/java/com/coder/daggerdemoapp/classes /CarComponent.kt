package com.coder.daggerdemoapp.classes

import com.coder.daggerdemoapp.MainActivity
import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car
    //for fueled injection
    fun inject(mainActivity: MainActivity);
}