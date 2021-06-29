package sharding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sharding.dao.OrderConfig;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-16 22:06
 **/
public interface OrderConfigRepository extends JpaRepository<OrderConfig,Integer> {
}
