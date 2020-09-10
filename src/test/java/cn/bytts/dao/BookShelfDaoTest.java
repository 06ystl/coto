package cn.bytts.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author LZT
 * @Date 2020/9/10
 * @Time 18:01
 * @Description
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookShelfDaoTest {

    @Autowired
    BookShelfDao bookShelfDao;

    @Test
    public void selectBookShelfByTag() {
        System.out.println(bookShelfDao.selectBookShelfByTag(100001));
    }

    @Test
    public void insertBookShelf() {

    }
}