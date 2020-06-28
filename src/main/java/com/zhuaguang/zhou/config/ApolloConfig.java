package com.zhuaguang.zhou.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

public class ApolloConfig {

    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig();
        System.setProperty("app.id","SampleApp");
        System.setProperty("env","DEV");
        System.setProperty("dev_meta","http://192.168.198.130:8080");
        String name = config.getProperty("name", null);
        System.out.println("name: " + name);
    }
}
