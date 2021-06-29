import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sharding.FkFbApplication;
import sharding.dao.Order;
import sharding.dao.OrderConfig;
import sharding.repository.OrderConfigRepository;
import sharding.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-16 22:31
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FkFbApplication.class)
public class OrderTest {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderConfigRepository orderConfigRepository;

    @Test
    public void test(){
//        List<Order> all = orderRepository.findAll();
//        all.forEach(x->{
//            System.out.println("===================="+x.toString());
//        });

        Order order = new Order();
        order.setUserId(2);
        orderRepository.save(order);
    }

    @Test
    public void test1(){
//        Optional<OrderConfig> byId = orderConfigRepository.findById(1);
//        if (byId.isPresent()){
//            System.out.println(byId.get().toString());
//        }
        OrderConfig orderConfig = new OrderConfig();
        orderConfig.setId(2);
        orderConfig.setPayTimeout(1234);
        orderConfigRepository.save(orderConfig);
    }
}
