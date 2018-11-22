package liu.york.dubbo.spring.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import liu.york.dubbo.spring.api.model.Order;
import liu.york.dubbo.spring.api.model.User;
import liu.york.dubbo.spring.api.order.OrderService;
import liu.york.dubbo.spring.api.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerService {

    /**
     * 加载 classpath:consumer.xml 文件的时候会生成一个proxy-bean，并且在容器中，这个bean可以被强转为服务提供方的
     * 任意接口，这个代理类是 ali 包下的，就是通过这个类去 rpc 远程调用
     * 所以这里需要使用 @Autowired 注解，而不是 @Reference 注解
     */
    @Autowired(required = false)
    private UserService userService;

    @Autowired(required = false)
    private OrderService orderService;

    public List<User> queryUser(){
        return userService.query();
    }

    public List<Order> queryOrder(){
        return orderService.query();
    }

}