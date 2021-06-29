package cn.iocoder.springboot.lab21.cache.mapper.cache.impl;

import cn.iocoder.springboot.lab21.cache.convert.UserConvert;
import cn.iocoder.springboot.lab21.cache.dataobject.cache.UserCache;
import cn.iocoder.springboot.lab21.cache.dataobject.db.UserDO;
import cn.iocoder.springboot.lab21.cache.mapper.cache.UserCacheMapper;
import cn.iocoder.springboot.lab21.cache.mapper.db.UserMapper;
import cn.iocoder.springboot.lab21.cache.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-29 22:39
 **/
@Service
public class UserCacheMapperImpl implements UserCacheMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String selectById(Integer id) {
        System.out.println(userMapper.selectById(id).toString());
        UserCache userCache = UserConvert.INSTANCE.convert(userMapper.selectById(id));
        return JSONUtil.toJSONString(userCache);
    }

    @Override
    public String insert(UserDO user) {
        UserDO userDO = userMapper.insert0(user);
        return JSONUtil.toJSONString(UserConvert.INSTANCE.convert(userDO));
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }
}
