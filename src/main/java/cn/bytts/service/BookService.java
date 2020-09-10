package cn.bytts.service;

import cn.bytts.domain.Book;

/**
 * @Author LZT
 * @Date 2020/9/5
 * @Time 15:13
 * @Description 书籍服务层接口
 */
public interface BookService {

    /**
     * 通过id查找
     * @param id
     * @return
     */
    Book selectBookById(Integer id);

    /**
     * 通过名字查找
     * @param name
     * @return
     */
    Book selectBookByName(String name);
}
