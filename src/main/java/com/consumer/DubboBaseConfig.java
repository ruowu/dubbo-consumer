package com.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * Created: 2017/4/12
 * dubbo基础配置
 */
public class DubboBaseConfig {

    @Value("${dubbo.address}")
    private String dubboAddress;

    @Value("${dubbo.port}")
    private Integer port;

    @Bean
    public RegistryConfig registry() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboAddress);
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ApplicationConfig application() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("testName");
        return applicationConfig;
    }


}
