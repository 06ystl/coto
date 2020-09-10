package cn.bytts.dao;

import cn.bytts.domain.UserInfo;
import org.springframework.stereotype.Repository;


/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:07
 * @Description 用户信息数据层接口
 */
@Repository
public interface UserInfoDao {



    /**
     * 通过tag查找用户信息
     * @param tag tag
     * @return UserInfo
     */
    UserInfo selectUserInfoByTag(Integer tag);

    /**
     * 保存用户信息
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
