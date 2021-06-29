package cn.iocoder.springboot.lab21.cache.convert;

import cn.iocoder.springboot.lab21.cache.dataobject.cache.UserCache;
import cn.iocoder.springboot.lab21.cache.dataobject.db.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-29 22:14
 **/
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserCache convert(UserDO userDO);
}
