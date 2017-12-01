package com.sheng.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shengxingyue, created on 2017/12/1
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    // 默认配置
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
