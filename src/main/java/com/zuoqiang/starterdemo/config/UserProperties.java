package com.zuoqiang.starterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 了解spring-boot starter类的启动原理
 *
 * @author zuoqiang
 */
@Data
@ConfigurationProperties(prefix = "testauto.user")
public class UserProperties {
    private String name;

    public UserProperties() {
    }

    public UserProperties(String name) {
        this.name = name;
    }
}
