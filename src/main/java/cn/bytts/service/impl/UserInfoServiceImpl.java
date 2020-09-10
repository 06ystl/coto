package cn.bytts.service.impl;

import cn.bytts.dao.UserInfoDao;
import cn.bytts.domain.UserInfo;
import cn.bytts.service.UserInfoService;
import cn.bytts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LZT
 * @Date 2020/8/9
 * @Time 16:09
 * @Description 用户信息类服务层接口实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    @Autowired
    UserService userService;

    @Override
    public UserInfo selectUserInfoByTag(Integer tag) {
        return userInfoDao.selectUserInfoByTag(tag);
    }

    @Override
    public int saveUserInfo(UserInfo userInfo) {

        if (userService.selectUserByTag(userInfo.getTag())!=null) {
            return userInfoDao.saveUserInfo(userInfo);
        }
        return 0;
    }

    @Override
    public int updateUser(UserInfo userInfo) {

        if (userInfoDao.selectUserInfoByTag(userInfo.getTag()) != null) {
            return userInfoDao.updateUser(userInfo);
        }
        return 0;
    }
}
