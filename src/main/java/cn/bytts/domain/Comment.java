package cn.bytts.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:12
 * @Description 评论类
 */
public class Comment implements Serializable {

    /** 书籍id，外键*/
    private Integer id;

    private String name;

    private String context;

    private Integer award;
    
    private Date time;

}
