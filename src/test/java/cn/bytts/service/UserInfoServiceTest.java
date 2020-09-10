package cn.bytts.service;

import cn.bytts.dao.UserInfoDao;
import cn.bytts.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author LZT
 * @Date 2020/8/15
 * @Time 12:41
 * @Description
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoServiceTest {

    @Autowired
    UserInfoDao userInfoDao;

    @Test
    public void selectUserInfoByTag() {
    }

    @Test
    public void saveUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setTag(100003);
        List <String>list = new ArrayList();
        list.add("言情");
        list.add("玄幻");
        userInfo.setHobby(list);
        userInfo.setGrade(1);
        userInfo.setName("haa");
        System.out.println(userInfoDao.saveUserInfo(userInfo));
    }
}