package cn.bytts.service;

import cn.bytts.domain.UserInfo;

/**
 * @Author LZT
 * @Date 2020/8/9
 * @Time 16:09
 * @Description 用户信息类服务层接口
 */
public interface UserInfoService {

    /**
     * 通过tag查找用户信息
     * @param tag tag
     * @return UserInfo
     */
    UserInfo selectUserInfoByTag(Integer tag);

    /**
     * 保存userInfo
     * @param userInfo
     * @return
     */
    int saveUserInfo(UserInfo userInfo);

    /**
     * 更新
     * @param userInfo
     * @return
     */
    int updateUser(UserInfo userInfo);

}
