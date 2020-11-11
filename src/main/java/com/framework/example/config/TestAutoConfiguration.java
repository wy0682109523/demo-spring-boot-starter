package com.framework.example.config;

import com.framework.example.api.DemoStarterTest;
import com.framework.example.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyu
 * @date 2020/11/11
 */
@Configuration
@ConditionalOnClass(DemoStarterTest.class)
@EnableConfigurationProperties(TestProperties.class)
public class TestAutoConfiguration {

    @Autowired
    private TestProperties properties;

    @Bean
    @ConditionalOnMissingBean(DemoStarterTest.class)
    public DemoStarterTest demoService() {
        return new DemoStarterTest(properties);
    }
}
