package cn.zd.springboot.lab17.dataobject;

import lombok.Data;

import javax.persistence.*;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-05-18 22:36
 **/
@Data
@Entity
@Table(name= "users")
public class UserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,  // strategy 设置使用数据库主键自增策略；
            generator = "JDBC") // generator 设置插入完成后，查询最后生成的 ID 填充到该属性中。
    private Integer id;

    @Column(name = "user_name")
    private String username;
}
