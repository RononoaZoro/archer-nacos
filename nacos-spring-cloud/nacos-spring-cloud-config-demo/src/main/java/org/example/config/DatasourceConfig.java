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
@ConfigurationProperties(prefix = "datasource")
public class DatasourceConfig {

    private Long id;
//    @Value("${app}")
    private String datasource;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    @Override
    public String toString() {
        return "DatasourceConfig{" +
                "id=" + id +
                ", datasource='" + datasource + '\'' +
                '}';
    }
}
