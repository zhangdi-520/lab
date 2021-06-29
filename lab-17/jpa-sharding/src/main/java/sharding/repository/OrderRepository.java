package sharding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sharding.dao.Order;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-16 19:40
 **/
public interface OrderRepository extends JpaRepository<Order,Long> {
}
