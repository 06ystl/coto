package cn.bytts.dao;

import cn.bytts.domain.BookShelf;

/**
 * @Author LZT
 * @Date 2020/7/23
 * @Time 16:31
 * @Description 书架数据层接口
 */
public interface BookShelfDao {

    /**
     * 通过tag查询
     * @param tag
     * @return
     */
    BookShelf selectBookShelfByTag(Integer tag);

    /**
     * 插入
     * @param bookShelf
     * @return
     */
    int insertBookShelf(BookShelf bookShelf);

    int deleteBookShelfById(Integer tag);


}
