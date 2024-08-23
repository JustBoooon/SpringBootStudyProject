package com.xiao.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName {@link HelloController}
 * @Description Controller
 * @Author XiaoYang
 * @Date 2024/8/23 14:10
 * @Version 1.0.0
 */
// @ResponseBody
// @Controller
@RestController // @RestController 包含 @ResponseBody + @Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Ciallo～(∠・ω< )⌒☆";
    }
}
