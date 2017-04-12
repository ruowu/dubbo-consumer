package com.consumer;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.producer.api.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created: 2017/4/12
 */
@Configuration
public class RefServiceConfig extends DubboBaseConfig {

    @Value("${dubbo.version}")
    private String version;

    @Bean
    public ReferenceBean<TestService> person() {
        ReferenceBean<TestService> ref = new ReferenceBean<TestService>();
        ref.setVersion(version);
        ref.setInterface(TestService.class);
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
    }
}
