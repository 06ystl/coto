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

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User selectUserByEmail(String email) {
        return userDao.selectUserByEmail(email);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int deleteUserByEmail(String email) {
        return userDao.deleteUserByEmail(email);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}
