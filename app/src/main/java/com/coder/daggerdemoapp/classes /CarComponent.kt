package com.coder.daggerdemoapp.classes

import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car
}