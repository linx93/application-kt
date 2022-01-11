package com.kt.applicationkt.controller;


import com.kt.applicationkt.model.po.GrantResultProvide6
import com.kt.applicationkt.service.GrantResultProvide6Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * <p>
 * 授权结果返回表(提供方) <6> 前端控制器
 * </p>
 *
 * @author linx
 * @since 2021-12-21
 */
@RestController
@RequestMapping("/grant-result-provide6")
class GrantResultProvide6Controller {
    @Autowired
    private lateinit var grantResultProvide6Service: GrantResultProvide6Service


    @GetMapping("list/{id}")
    fun test(@PathVariable("id") id: Int): MutableList<GrantResultProvide6> {
        return grantResultProvide6Service.test(id)
    }
}

