package cn.bytts.domain;

import java.io.Serializable;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:09
 * @Description 书架类
 */
public class BookShelf implements Serializable {

    /** 用户标识 外键*/
    private Integer tag;

    /** 书籍id 外键*/
    private Integer id;

    private Integer percent;

    private Boolean isUpdate;


}
