package com.zuoqiang.starterdemo.auto;

import com.zuoqiang.starterdemo.bean.UserClient;
import com.zuoqiang.starterdemo.config.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author zuoqiang
 */
@Configuration
@EnableConfigurationProperties(value = UserProperties.class)
public class UserAutoConfigure {
    @Autowired
    private UserProperties properties;

    @Bean
    @ConditionalOnProperty(prefix = "testauto.user", value = "enabled", havingValue = "true")
    public UserClient userClient(UserProperties properties) {
        return new UserClient(properties);
    }

}
