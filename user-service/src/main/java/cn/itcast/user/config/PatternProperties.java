package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: PatternProperties
 * Package:cn.itcast.user.config
 * Description:
 *
 * @Author huojz
 * @project cloud-demo
 * @create 2023 02 18 11:38
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")//属性注入,以pattern开头
public class PatternProperties {
    private  String dateformat;
    private  String envSharedVale;
}
