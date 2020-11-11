package com.framework.example.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangyu
 * @date 2020/11/11
 */
@Data
@ConfigurationProperties(prefix = "demo-test")
public class TestProperties {

    private String message;

    private int type;
}
