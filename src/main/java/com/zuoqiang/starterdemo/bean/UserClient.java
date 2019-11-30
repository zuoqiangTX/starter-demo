package com.zuoqiang.starterdemo.bean;

import com.zuoqiang.starterdemo.config.UserProperties;
import lombok.Getter;
import lombok.ToString;

/**
 * @author zuoqiang
 */
@Getter
@ToString
public class UserClient {
    private UserProperties userProperties;

    public UserClient() {
    }

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }
}
