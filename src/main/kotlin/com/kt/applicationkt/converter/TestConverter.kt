package com.kt.applicationkt.converter

import com.kt.applicationkt.model.po.TestPO
import com.kt.applicationkt.model.vo.TestVO
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings


/**
 * 测试转换器
 * @author linx
 * @since 2021-12-21 11:26
 *
 */

@Mapper(componentModel = "spring")
interface TestConverter {

    @Mappings(
            Mapping(source = "age", target = "age"),
            Mapping(source = "name", target = "userName"),
    )
    fun testPO2TestVO(testPO: TestPO): TestVO


    @InheritInverseConfiguration
    fun testVO2TestPO(testVO: TestVO): TestPO


    @Mappings(
            Mapping(source = "age", target = "age"),
            Mapping(source = "name", target = "userName"),
    )
    fun testPO2MapVO(testPO: TestPO): MutableMap<String, String>

}