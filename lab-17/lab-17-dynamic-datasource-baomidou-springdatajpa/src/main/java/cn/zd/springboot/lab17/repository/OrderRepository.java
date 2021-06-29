package cn.zd.springboot.lab17.repository;

import cn.zd.springboot.lab17.dataobject.OrderDo;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.data.repository.CrudRepository;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-05-18 22:38
 **/
@DS("orders")
public interface OrderRepository extends CrudRepository<OrderDo, Integer> {
}
