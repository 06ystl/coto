package cn.bytts.dao;

import cn.bytts.domain.Book;

/**
 * @Author LZT
 * @Date 2020/7/23
 * @Time 16:31
 * @Description 书籍数据层接口
 */
public interface BookDao {

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
