package com.example.tugasclass2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasclass.ChildrenClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create an instance of MyClass
        val ChildrenClassInstance = ChildrenClass()

        // Call a method from MyClass
        ChildrenClassInstance.doSomething()
    }
}