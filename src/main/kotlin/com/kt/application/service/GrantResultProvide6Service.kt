package com.kt.application.service;

import com.kt.application.model.po.GrantResultProvide6;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 授权结果返回表(提供方) <6> 服务类
 * </p>
 *
 * @author linx
 * @since 2021-12-21
 */
interface GrantResultProvide6Service : IService<GrantResultProvide6> {
    fun test(id: Int): MutableList<GrantResultProvide6>
}
