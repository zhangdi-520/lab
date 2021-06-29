package sharding.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-16 19:37
 **/
@Entity
@Table(name = "order_config")
@Data
public class OrderConfig {

    @Id
    private Integer id;

    private Integer payTimeout;
}
