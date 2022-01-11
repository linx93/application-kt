package com.kt.applicationkt.model.po

class TestPO {
    var id: Int = 0

    var age: Int = 0

    var name: String = ""

    override fun toString(): String {
        return "{age:$id,age:$age,name:$name}"
    }
}