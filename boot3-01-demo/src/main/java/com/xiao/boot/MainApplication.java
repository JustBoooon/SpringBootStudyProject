package com.xiao.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName {@link MainApplication}
 * @Description 启动springboot项目的入口
 * @Author XiaoYang
 * @Date 2024/8/23 14:08
 * @Version 1.0.0
 */
@SpringBootApplication  // 告诉SpringBoot这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        // 固定写法，springboot的启动代码
        SpringApplication.run(MainApplication.class, args);
    }
}
