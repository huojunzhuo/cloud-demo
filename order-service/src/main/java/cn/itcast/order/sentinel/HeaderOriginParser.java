package cn.itcast.order.sentinel;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Huojz
 * @Description
 * @Date 2023-03-05 16:46
 */
@Component
public class HeaderOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        // 1 获取请求头
        String origin = httpServletRequest.getHeader("origin");
        // 2 非空判断
        if (StringUtils.isEmpty(origin)){
            origin = "blank";
        }
        return origin;
    }
}
