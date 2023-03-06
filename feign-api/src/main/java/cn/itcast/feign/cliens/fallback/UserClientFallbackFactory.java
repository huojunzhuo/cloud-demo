package cn.itcast.feign.cliens.fallback;

import cn.itcast.feign.cliens.UserClient;
import cn.itcast.feign.pojo.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Huojz
 * @Description
 * @Date 2023-03-05 14:22
 */
@Slf4j
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable throwable) {
        return new UserClient() {
            @Override
            public User findById(Long id) {
                log.error("查询用户异常",throwable);
                return new User();
            }
        };
    }
}
