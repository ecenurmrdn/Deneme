package com.ecemerdan.deneme
var count = 0
class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun counter(): String{
        count++
        return count.toString()
    }
}