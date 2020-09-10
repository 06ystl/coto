package cn.bytts.service.impl;

import cn.bytts.dao.UserDao;
import cn.bytts.domain.User;
import cn.bytts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 17:57
 * @Description 用户服务层接口实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User selectUserByEmail(String email) {
        return userDao.selectUserByEmail(email);
    }

    @Override
    public User selectUserByTag(Integer tag) {
        return userDao.selectUserByTag(tag);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int deleteUserByTag(Integer tag) {
        if (userDao.selectUserByTag(tag) != null) {
            return userDao.deleteUserByTag(tag);
        }
        return 0;
    }

    @Override
    public int updateUser(User user) {
        if (userDao.selectUserByTag(user.getTag()) != null) {
            return userDao.updateUser(user);
        }
        return 0;
    }
}
