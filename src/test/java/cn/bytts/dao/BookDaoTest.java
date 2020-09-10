package cn.bytts.dao;

import cn.bytts.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author LZT
 * @Date 2020/8/21
 * @Time 11:15
 * @Description
 */
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookDaoTest {

    @Autowired
    BookDao bookDao;
    @Test
    public void selectBookById() {
        Book book = bookDao.selectBookById(10001);
        System.out.println(book);
    }

    @Test
    public void selectBookByName() {
    }
}