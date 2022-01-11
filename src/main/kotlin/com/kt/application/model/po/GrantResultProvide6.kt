package com.kt.application.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable;
/**
 * <p>
 * 授权结果返回表(提供方) <6>
 * </p>
 *
 * @author linx
 * @since 2021-12-21
 */
@TableName("grant_result_provide_6")
class GrantResultProvide6 : Serializable {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    /**
     * 授权通知id
     */
    var noticeId: Long? = null
    /**
     * 发起方企业etds唯一编号
     */
    var applyEtdsUuid: String? = null
    /**
     * 数据授权方企业dtid
     */
    var grantDtid: String? = null
    /**
     * 数据授权方企业名称
     */
    var grantName: String? = null
    /**
     * 数据提供方企业dtid
     */
    var toDtid: String? = null
    /**
     * 数据提供方企业名称
     */
    var toName: String? = null
    /**
     * 数据提供方企业etds唯一编号
     */
    var toEtdsUuid: String? = null
    /**
     * 授权详情
     */
    var grantDetails: String? = null
    /**
     * 授权状态
     */
    var grantStatus: String? = null
    /**
     * 凭证id
     */
    var claimId: String? = null
    /**
     * 授权的凭证
     */
    var grantDocument: String? = null
    /**
     * 用于标记tdaas控制此授权凭证的状态（0:正常 1:暂停）
     */
    var useStatus: Int? = null
    /**
     * 统一业务标识号
     */
    var serialNumber: String? = null
    /**
     * 操作时间
     */
    var operatedTime: Long? = null
    /**
     * 创建时间
     */
    var createdTime: Long? = null
    /**
     * 数据请求方企业数字身份
     */
    var applyDtid: String? = null
    /**
     * 数据请求方企业企业名称
     */
    var applyName: String? = null


    override fun toString(): String {
        return "GrantResultProvide6{" +
        "id=" + id +
        ", noticeId=" + noticeId +
        ", applyEtdsUuid=" + applyEtdsUuid +
        ", grantDtid=" + grantDtid +
        ", grantName=" + grantName +
        ", toDtid=" + toDtid +
        ", toName=" + toName +
        ", toEtdsUuid=" + toEtdsUuid +
        ", grantDetails=" + grantDetails +
        ", grantStatus=" + grantStatus +
        ", claimId=" + claimId +
        ", grantDocument=" + grantDocument +
        ", useStatus=" + useStatus +
        ", serialNumber=" + serialNumber +
        ", operatedTime=" + operatedTime +
        ", createdTime=" + createdTime +
        ", applyDtid=" + applyDtid +
        ", applyName=" + applyName +
        "}"
    }
}
