package liu.york.dubbo.spring.order.provider.service;

import liu.york.dubbo.spring.api.model.Order;
import liu.york.dubbo.spring.api.order.OrderService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> query() {
        Order o1 = new Order();
        Order o2 = new Order();

        o1.setName("衣服");o1.setPrice(1000);
        o2.setName("裤子");o2.setPrice(150);

        return Arrays.asList(o1, o2);
    }
}