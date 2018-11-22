package liu.york.dubbo.spring.api.user;

import liu.york.dubbo.spring.api.model.User;

import java.util.List;

public interface UserService {
    List<User> query();

}