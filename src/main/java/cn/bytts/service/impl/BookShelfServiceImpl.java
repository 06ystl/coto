package cn.bytts.service.impl;


import cn.bytts.dao.BookShelfDao;
import cn.bytts.domain.BookShelf;
import cn.bytts.service.BookShelfService;
import org.springframework.stereotype.Service;

/**
 * @Author LZT
 * @Date 2020/9/5
 * @Time 15:15
 * @Description 书架服务层接口实现类
 */
@Service
public class BookShelfServiceImpl implements BookShelfService {

    BookShelfDao bookShelfDao;

    @Override
    public BookShelf selectBookShelfByTag(Integer tag) {
        return bookShelfDao.selectBookShelfByTag(tag);
    }

    @Override
    public int insertBookShelf(BookShelf bookShelf) {
        return bookShelfDao.insertBookShelf(bookShelf);
    }
}
