package cn.iocoder.springboot.labs.lab10.springdatarediswithjedis;

import cn.iocoder.springboot.labs.lab10.springdatarediswithjedis.cacheobject.UserCacheObject;
import cn.iocoder.springboot.labs.lab10.springdatarediswithjedis.dao.redis.UserCacheDao;
import cn.iocoder.springboot.labs.lab10.springdatarediswithjedis.util.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserCacheDao userCacheDao;

    @Test
    public void testSetMyConfiguration() throws UnsupportedEncodingException {
        UserCacheObject userCacheObject = new UserCacheObject();
        userCacheObject.setId(1).setGender(1).setName("尼玛");
//        redisTemplate.opsForValue().set("1", userCacheObject);
//        System.out.println(JSON.toJSONBytes(userCacheObject,SerializerFeature.WriteClassName));
//        System.out.println(JSONUtil.toJSONString(userCacheObject));
//        System.out.println(JSONUtil.toJSONBytes(userCacheObject));
//        System.out.println(JSONUtil.parseObject(new String(JSONUtil.toJSONBytes(userCacheObject),"UTF-8"),UserCacheObject.class));
        userCacheDao.set(userCacheObject.getId(), userCacheObject);
    }

    @Test
    public void testGetMyConfiguration(){
        System.out.println(userCacheDao.get(1));
    }

    @Test
    public void testStringSetKey() {
        stringRedisTemplate.opsForValue().set("yunai", "shuai");
    }

    @Test
    public void testStringSetKey02() {
        redisTemplate.opsForValue().set("yunai", "shuai");
    }

    @Test
    public void testSetAdd() {
        stringRedisTemplate.opsForSet().add("yunai_descriptions", "shuai", "cai");
    }

    @Test
    public void testStringSetKeyUserCache() {
        UserCacheObject object = new UserCacheObject()
                .setId(1)
                .setName("芋道源码")
                .setGender(1); // 男
        String key = String.format("user:%d", object.getId());
        redisTemplate.opsForValue().set(key, object);
    }

    @Test
    public void testStringGetKeyUserCache() {
        String key = String.format("user:%d", 1);
        Object value = redisTemplate.opsForValue().get(key);
        System.out.println(value);
    }

}
