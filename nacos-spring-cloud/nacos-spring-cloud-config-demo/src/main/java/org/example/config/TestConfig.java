package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname TestConfig
 * @Description TODO
 * @Date 2020/1/16 17:20
 * @Created by luoxz
 */
@Configuration
@ConfigurationProperties(prefix = "test")
public class TestConfig {
    private Long id;
    private String authKey;
    private Integer asyncThreadNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public Integer getAsyncThreadNum() {
        if (null == asyncThreadNum) return 1;
        return asyncThreadNum;
    }

    public void setAsyncThreadNum(Integer asyncThreadNum) {
        this.asyncThreadNum = asyncThreadNum;
    }

    @Override
    public String toString() {
        return "TestConfig{" +
                "id=" + id +
                ", authKey='" + authKey + '\'' +
                ", asyncThreadNum=" + asyncThreadNum +
                '}';
    }
}
