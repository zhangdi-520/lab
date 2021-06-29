package cn.iocoder.springboot.lab21.cache.dataobject.cache;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @version V1.0
 * @program: labs-parent
 * @description: TODO
 * @author: Mr.Zhang
 * @create: 2021-06-29 22:10
 **/
@Data
@Accessors(chain = true)
public class UserCache {


    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码（明文）
     *
     * ps：生产环境下，千万不要明文噢
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否删除
     */
    private Integer deleted;
}
