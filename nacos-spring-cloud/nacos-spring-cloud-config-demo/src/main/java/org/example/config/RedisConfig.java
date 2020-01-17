package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname RedisConfig
 * @Description TODO
 * @Date 2020/1/16 19:41
 * @Created by luoxz
 */
@Configuration
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {

    private Long id;
    private String redis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRedis() {
        return redis;
    }

    public void setRedis(String redis) {
        this.redis = redis;
    }

    @Override
    public String toString() {
        return "RedisConfig{" +
                "id=" + id +
                ", redis='" + redis + '\'' +
                '}';
    }
}
