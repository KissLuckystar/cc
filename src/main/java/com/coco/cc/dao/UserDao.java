package com.coco.cc.dao;

import com.coco.cc.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * **********************************
 * @Author : CoCo
 * @Date : 2019/4/28 14:41
 * @Version : 1.0
 * @Description :
 * **********************************
 */
@Mapper
public interface UserDao {
    /**
     * 更改用户信息
     * @param user
     * @return
     */
    int updateUserInfo(UserDomain user);

    /**
     * 根据主键编号获取用户信息
     * @param uId
     * @return
     */
    UserDomain getUserInfoById(@Param("uid") Integer uId);

    /**
     * 根据用户名和密码获取用户信息
     * @param username
     * @param password
     * @return
     */
    UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);
}
