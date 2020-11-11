package com.framework.example.api;

import com.framework.example.properties.TestProperties;

/**
 * @author wangyu
 * @date 2020/11/11
 */
public class DemoStarterTest {

    private TestProperties properties;

    public DemoStarterTest(TestProperties properties) {
        this.properties = properties;
    }

    public void doTest() {
        System.out.println("start doing something");
        System.out.println("msg[" + properties.getType() + "]：" + properties.getMessage());
        System.out.println("end doing something");
    }
}
