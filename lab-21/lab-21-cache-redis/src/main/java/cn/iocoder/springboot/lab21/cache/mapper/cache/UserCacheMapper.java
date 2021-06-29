package cn.iocoder.springboot.lab21.cache.mapper.cache;

import cn.iocoder.springboot.lab21.cache.convert.UserConvert;
import cn.iocoder.springboot.lab21.cache.dataobject.cache.UserCache;
import cn.iocoder.springboot.lab21.cache.dataobject.db.UserDO;
import cn.iocoder.springboot.lab21.cache.mapper.db.UserMapper;
import cn.iocoder.springboot.lab21.cache.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-29 22:24
 **/
@CacheConfig(cacheNames = "users")
public interface UserCacheMapper {



    @Cacheable(key = "#id")
    String selectById(Integer id);

    @CachePut(key = "user.id")
    String insert(UserDO user);

    @CacheEvict(key = "#id")
    int deleteById(Integer id);

}
