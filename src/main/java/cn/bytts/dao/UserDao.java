package cn.bytts.dao;

import cn.bytts.domain.User;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:05
 * @Description 用户数据层接口
 */
public interface UserDao {

    /**
     * 通过tag查找
     * @param email
     * @return
     */
    User selectUserByEmail(String email);

    /**
     * 插入
     * @param user
     * @return
     */
    int insertUser(User user);


    /**
     * 通过tag删除
     * @param email
     * @return
     */
    int deleteUserByEmail(String email);

    /**
     * 更新
     * @param user
     * @return
     */
    int updateUser(User user);
}
