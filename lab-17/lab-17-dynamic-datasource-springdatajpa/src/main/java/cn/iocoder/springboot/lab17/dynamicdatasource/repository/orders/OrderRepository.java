package cn.iocoder.springboot.lab17.dynamicdatasource.repository.orders;

import cn.iocoder.springboot.lab17.dynamicdatasource.dataobject.order.OrderDO;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDO, Integer> {

}
