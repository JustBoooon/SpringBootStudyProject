package com.xiao.boot.bean;

/**
 * @ClassName {@link User}
 * @Description 
 * @Author XiaoYang
 * @Date 2024/9/5 18:00
 * @Version 1.0.0
 */
public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
