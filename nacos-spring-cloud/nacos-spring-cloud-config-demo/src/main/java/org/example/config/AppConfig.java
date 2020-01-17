package org.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname app
 * @Description TODO
 * @Date 2020/1/16 19:40
 * @Created by luoxz
 */
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfig {

//    @Value ("${id}")
    private Long id;
    private String app;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "id=" + id +
                ", app='" + app + '\'' +
                '}';
    }
}
