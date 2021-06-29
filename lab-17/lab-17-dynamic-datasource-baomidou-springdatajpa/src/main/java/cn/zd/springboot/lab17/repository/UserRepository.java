package cn.zd.springboot.lab17.repository;

import cn.zd.springboot.lab17.dataobject.UserDO;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.data.repository.CrudRepository;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-05-18 22:39
 **/
@DS("users")
public interface UserRepository extends CrudRepository<UserDO, Integer> {
}
