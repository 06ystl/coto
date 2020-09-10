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
     * 通过email查找
     * @param email
     * @return
     */
    User selectUserByEmail(String email);

    /**
     * 通过tag查找
     * @param tag
     * @return
     */
    User selectUserByTag(Integer tag);

    /**
     * 插入
     * @param user
     * @return
     */
    int insertUser(User user);


    /**
     * 通过tag删除
     * @param tag
     * @return
     */
    int deleteUserByTag(Integer tag);

    /**
     * 更新
     * @param user
     * @return
     */
    int updateUser(User user);
}
