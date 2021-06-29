package cn.zd.springboot.lab17.dataobject;

import cn.zd.springboot.lab17.constant.DBConstants;
import lombok.Data;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.persistence.*;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: 订单实体
 * @author: Mr.Zhang
 * @create: 2021-05-18 22:28
 **/
@Data
@Entity
@Table(name = "orders")
public class OrderDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,  // strategy 设置使用数据库主键自增策略；
            generator = "JDBC") // generator 设置插入完成后，查询最后生成的 ID 填充到该属性中。
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;
}
