package com.example.kmpapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}