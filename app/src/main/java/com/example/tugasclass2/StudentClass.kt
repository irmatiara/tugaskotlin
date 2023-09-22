package com.example.tugasclass

open class StudentClass {
    val x = 5

    // Subclass
    class SiswaClass: StudentClass() {
        fun myFunction() {
            println(x)
        }
    }

    fun main() {
        val myObj = SiswaClass()
        myObj.myFunction()
    }
}