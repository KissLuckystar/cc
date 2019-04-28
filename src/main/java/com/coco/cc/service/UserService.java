package com.coco.cc.service;

import com.coco.cc.model.UserDomain;
import org.springframework.stereotype.Service;

/**
 * **********************************
 *
 * @Author : CoCo
 * @Date : 2019/4/28 21:08
 * @Version : 1.0
 * @Description :
 * **********************************
 */
@Service
public interface UserService {
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
    UserDomain getUserInfoById(Integer uId);

    /**
     * 根据用户名和密码获取用户信息，用户登录
     * @param username
     * @param password
     * @return
     */
    UserDomain getUserInfoByCond(String username, String password);
}
