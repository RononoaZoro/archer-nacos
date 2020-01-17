package org.example.controller;

import org.example.config.AppConfig;
import org.example.config.DatasourceConfig;
import org.example.config.RedisConfig;
import org.example.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${name:b}")
    private String name;

    @Resource
    private TestConfig testConfig;
    @Autowired
    private AppConfig appConfig;
    @Autowired
    private RedisConfig redisConfig;
    @Autowired
    private DatasourceConfig datasourceConfig;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

    @RequestMapping("/get/name")
    public String getName() {
        return name;
    }

    @RequestMapping("/get/muti")
    public String getMuti() {
        String test = appConfig.toString() + datasourceConfig.toString() + redisConfig.toString();
        return test + testConfig.toString();
    }
}