package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;


/**
 * @author Huojz
 * @Description
 * @Date 2023-02-21 21:11
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }

}
