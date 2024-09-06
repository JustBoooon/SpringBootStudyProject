package com.xiao.boot.config;

import com.alibaba.druid.FastsqlException;
import com.xiao.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName {@link AppConfig}
 * @Description 配置类
 * @Author XiaoYang
 * @Date 2024/9/5 18:05
 * @Version 1.0.0
 */
@Import(FastsqlException.class) // 第三方任意类，直接导入到容器中作为一个组件，组件名默认是全类名
@Configuration                  // 告诉 springboot 这是一个普通配置类，替代以前的配置文件。配置类本身也是容器中的一个组件
// @SpringBootConfiguration        // 这是一个 springboot 配置类，没大差，给开发人员区分用的
public class AppConfig {

    /**
     * 1、组件默认是单实例的
     *
     * @return
     */
    // @Bean            // 给容器中放组件，替代以前的 Bean 标签。未指定组件名时，组件在容器中的名字是方法名，如下 user
    @Bean("MyUser")     // 指定后组件在容器中的名字即为指定的名字，如 MyUser
    @Scope("prototype") // 调整组件的范围，单实例或多实例等。添加该注解后，组件就是多实例的，每次获取都会重新创建对象
    public User user() {
        var user = new User();
        user.setId(1L);
        user.setName("富强");
        return user;
    }

    /**
     * 方法一：直接写，第三方包任意对象注册到容器中的组件
    */
    // @Bean
    // public FastsqlException fastsqlException() {
    //     return new FastsqlException();
    // }
}
