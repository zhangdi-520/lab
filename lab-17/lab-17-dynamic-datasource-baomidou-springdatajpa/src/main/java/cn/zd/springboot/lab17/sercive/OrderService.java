package cn.zd.springboot.lab17.sercive;

import cn.zd.springboot.lab17.repository.OrderRepository;
import cn.zd.springboot.lab17.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-05-18 22:53
 **/
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

}
