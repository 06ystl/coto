package cn.bytts.service.impl;

import cn.bytts.dao.BookDao;
import cn.bytts.domain.Book;
import cn.bytts.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LZT
 * @Date 2020/9/5
 * @Time 15:14
 * @Description 书籍服务层接口实现类
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public Book selectBookById(Integer id) {
        return bookDao.selectBookById(id);
    }

    @Override
    public Book selectBookByName(String name) {
        return bookDao.selectBookByName(name);
    }
}
