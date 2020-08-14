package com.example.naonari.assignmenthumanclass

import android.util.Log

class Human (name: String, age: Int,var hobby: String ): Animal(name, age),Thinkable{
    override fun say() {
        Log.d("kotlinTest","「名前は" + name + "です。年は"+ age +"歳です。」")
    }
    override fun think() {
        Log.d("kotlinTest","「私は" + hobby + "について考える」")
    }
}