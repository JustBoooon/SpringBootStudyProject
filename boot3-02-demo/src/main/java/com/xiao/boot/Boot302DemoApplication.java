package com.xiao.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        // var：Java10 局部变量类型的自动推断，神似ts
        var ioc = SpringApplication.run(Boot302DemoApplication.class, args);
        // 获取容器所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        // 遍历显示
        // 包含以前需要手动配置的核心组件，现在全部由springboot自动配置好了
        for (String name : names) {
            System.out.println(name);
        }
    }

}
