package com.kt.application.service.impl;

import com.kt.application.model.po.GrantResultProvide6;
import com.kt.application.mapper.GrantResultProvide6Mapper;
import com.kt.application.service.GrantResultProvide6Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 授权结果返回表(提供方) <6> 服务实现类
 * </p>
 *
 * @author linx
 * @since 2021-12-21
 */
@Service
open class GrantResultProvide6ServiceImpl : ServiceImpl<GrantResultProvide6Mapper, GrantResultProvide6>, GrantResultProvide6Service {
    private var grantResultProvide6Mapper: GrantResultProvide6Mapper


    constructor(grantResultProvide6Mapper: GrantResultProvide6Mapper) : super() {
        this.grantResultProvide6Mapper = grantResultProvide6Mapper
    }

    override fun test(id: Int): MutableList<GrantResultProvide6> {
        val arrayList: MutableList<Int> = ArrayList()
        arrayList.add(1)
        val selectList: MutableList<GrantResultProvide6> = grantResultProvide6Mapper.selectList(null)
        return selectList
    }

}
