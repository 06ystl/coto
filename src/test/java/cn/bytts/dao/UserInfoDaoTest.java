package cn.bytts.dao;

import cn.bytts.domain.User;
import cn.bytts.domain.UserInfo;
import cn.bytts.utils.JsonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author LZT
 * @Date 2020/8/9
 * @Time 15:21
 * @Description
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoDaoTest {

    @Autowired
    UserInfoDao userInfoDao;


    @Test
    public void selectUserInfoByTag(){
        UserInfo userInfo = userInfoDao.selectUserInfoByTag(100001);
        System.out.println(JsonMapper.toJsonString(userInfo));
    }
}