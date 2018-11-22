package liu.york.dubbo.spring.user.provider.service;

import liu.york.dubbo.spring.api.model.User;
import liu.york.dubbo.spring.api.user.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> query() {
        User u1 = new User();
        User u2 = new User();

        u1.setUsername("张三");u1.setPassword("123456");
        u2.setUsername("李四");u2.setPassword("654321");

        return Arrays.asList(u1, u2);

    }
}