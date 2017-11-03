/* 
 * 项目名：	com.john
 * 文件名：	Application
 * 模块说明：	
 * 修改历史：
 * 2017/11/3 - ihui - 创建。
 */

package com.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ihui
 * @date 2017/11/3
 */
@SpringBootApplication
@EnableEurekaServer // 使用 Eureka 服务
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
