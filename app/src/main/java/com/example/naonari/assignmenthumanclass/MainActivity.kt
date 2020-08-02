package com.example.naonari.assignmenthumanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hikakin = Human("HIKAKIN",31,"Youtube")
        hikakin.say()
        hikakin.think()

        val seikin = Human("SEIKIN",33,"企画")
        seikin.say()
        seikin.think()

    }
}