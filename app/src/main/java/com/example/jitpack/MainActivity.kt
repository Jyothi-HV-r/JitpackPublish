package com.example.jitpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.TestService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestService().internalName()
    }
}