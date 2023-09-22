package com.example.tugasclass

public open class ChildrenClass : ParentClass (){
    fun myFun() {
        println(i)
    }
    fun main() {
        val myObj = ChildrenClass()
        myObj.myFun()
    }

    fun doSomething() {
        TODO("Not yet implemented")
    }
}