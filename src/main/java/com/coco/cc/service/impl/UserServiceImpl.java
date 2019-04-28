package com.coco.cc.service.impl;

import com.coco.cc.model.UserDomain;
import com.coco.cc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * **********************************
 *
 * @Author : CoCo
 * @Date : 2019/4/28 21:13
 * @Version : 1.0
 * @Description :
 * **********************************
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public int updateUserInfo(UserDomain user) {
        return 0;
    }

    @Override
    public UserDomain getUserInfoById(Integer uId) {
        return null;
    }

    @Override
    public UserDomain getUserInfoByCond(String username, String password) {
        return null;
    }
}
