package liu.york.dubbo.spring.api.order;

import liu.york.dubbo.spring.api.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> query();

}