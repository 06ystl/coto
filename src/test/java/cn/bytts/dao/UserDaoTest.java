package cn.bytts.dao;

import cn.bytts.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author LZT
 * @Date 2020/7/23
 * @Time 15:25
 * @Description
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void selectUserByTag() {
        User user = userDao.selectUserByEmail("1353092684@qq.com");
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        User user = new User(null,"159753","sfewf@gmail.com");
        int i = userDao.insertUser(user);
        System.out.println(i);
    }

    @Test
    public void deleteUserByTag() {
        userDao.deleteUserByEmail("100004");
    }

    @Test
    public void updateUser() {
        User user = new User(100005,"111111","sssss@gmail.com");
        userDao.updateUser(user);
    }
}