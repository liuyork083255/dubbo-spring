package liu.york.dubbo.spring.consumer.controller;

import liu.york.dubbo.spring.api.model.Order;
import liu.york.dubbo.spring.api.model.User;
import liu.york.dubbo.spring.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    public ConsumerService consumerService;


    @RequestMapping("/user/query")
    public List<User> queryUser(){
        return consumerService.queryUser();
    }

    @RequestMapping("/order/query")
    public List<Order> queryOrder(){
        return consumerService.queryOrder();
    }

}