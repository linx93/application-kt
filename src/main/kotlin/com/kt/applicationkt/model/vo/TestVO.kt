package com.kt.applicationkt.model.vo

class TestVO {
    var age: Int = 0

    var userName: String = ""

    override fun toString(): String {
        return "{age:$age,userName:$userName}"
    }
}