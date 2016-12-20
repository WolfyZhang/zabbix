package com.wolfy.test;

import java.security.Timestamp;
import java.util.Date;

public class Item {

    /** （只读）唯一标识 */
    private String itemid;

    /** （必填）延时更新时间 */
    private Integer delay;

    /** （必填）所属的主机编号 */
    private Integer hostid;

    /** （必填）所属主机接口ID */
    private Integer interfaceid;

    /** （必填）建 */
    private String key_;

    /** （必填）名称 */
    private String name;

    /** （必填）类型 */
    private Integer type;

    /** （必填）值类型 */
    private Integer value_type;

    /** SSH授权方法 */
    private Integer authtype;

    /** 数据类型 */
    private Integer data_type;

    /** 灵活变化序列化字符串 */
    private String delay_flex;

    /** 存储数据 */
    private Integer delta;

    /** 描述 */
    private String description;

    /** （只读）示警文字 */
    private String error;

    /** （只读）源 */
    private Integer flags;

    /** 自定义基数 */
    private Float formula;

    /** 历史数据时效 */
    private Integer history;

    /** 默认为0，不知用途 */
    private Integer inventory_link;

    /** IPMI感应器 */
    private String ipmi_sensor;

    /** （只读）最后更新时间 */
    private Timestamp lastclock;

    /** （只读）最后更新消耗时间 */
    private Integer lastns;

    /** （只读） 最后更新的值 */
    private String lastvalue;

    /** log实例格式化日期格式 */
    private String Logtimefmt;

    /** 监控日志时间最后更新时间 */
    private Timestamp mtime;

    /** 是否使用自定义基数 */
    private Integer multiplier;

    /** 额外参数 */
    private String params;

    /** 授权密码 */
    private String password;

    /** 端口 */
    private String port;

    /** 前一个数据 */
    private String prevvalue;

    /** 私有键文件名称 */
    private String privatekey;

    /** 公有键名称 */
    private String publickey;

    /**
     * （只读）陈述
     * 0 - 正常（默认）
     * 1 - 不支持
     */
    private Integer state;

    /**
     * 状态
     * 0 - 已启用
     * 1 - 已停用
     */
    private Integer status;

    /** （只读）父模板ID */
    private String templateid;

    /** 捕捉器允许主机 */
    private String trapper_hosts;

    /** 允许运行天数，默认365 */
    private Integer trends;

    /** 值单元 */
    private String units;

    /**
     * 权限控制用户名，适用于简单检查、SSH、TELNET、database monitor、JMX
     * SSH和TELNET必填
     */
    private String username;

    /** 关联的值映射ID */
    private String valuemapid;

    /** SNMP社区 */
    private String snmp_community;

    /** SNMP_OID */
    private String snmp_oid;

    /** SNMPv3通行码 */
    private String snmpv3_authpassphrase;

    /** SNMPv3上下文名称 */
    private String snmpv3_contextname;

    /** SNMPv3私钥口令 */
    private String snmpv3_privpassphrase;

    /**
     * SNMPv3私钥原型
     * 0 - DES （默认）
     * 1 - AES
     */
    private Integer snmpv3_privprotocol;

    /**
     * SNMPv3安全等级
     * 0 - 无权限无私钥
     * 1 - 有权限无私钥
     * 2 - 有权限有私钥
     */
    private Integer snmpv3_securitylevel;

    /** SNMPv3安全名称 */
    private String snmpv3_securityname;

}
