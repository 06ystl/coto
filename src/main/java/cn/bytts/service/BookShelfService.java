package cn.bytts.service;

import cn.bytts.domain.BookShelf;

/**
 * @Author LZT
 * @Date 2020/9/5
 * @Time 15:13
 * @Description 书架服务层接口
 */
public interface BookShelfService {

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

}
