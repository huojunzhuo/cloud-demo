package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaApplication
 * Package:cn.itcast.eureka
 * Description:
 *
 * @Author huojz
 * @project cloud-demo
 * @create 2023 02 11 11:43
 */
@EnableEurekaServer//eureka自动装配开关
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}


