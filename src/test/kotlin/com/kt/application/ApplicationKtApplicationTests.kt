package com.kt.application

import com.kt.application.converter.TestConverter
import com.kt.application.model.po.TestPO
import com.kt.application.model.vo.TestVO
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationKtApplicationTests {

    @Autowired
    private lateinit var testConverter: TestConverter

    @Test
    fun contextLoads() {
    }

    @Test
    fun testPO2TestVO() {
        testConverter.testPO2TestVO(TestPO().apply {
            this.id = 1
            age = 1
            name = "linx"
        }).also {
            println(it)
        }
    }

    @Test
    fun testVO2TestPO() {
        testConverter.testVO2TestPO(TestVO().apply {
            age = 100
            userName = "熊林"
        }).also {
            println(it)
        }
    }


}
