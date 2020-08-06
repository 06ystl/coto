package cn.bytts.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:11
 * @Description 文章索引类
 */
public class ArticleIndex implements Serializable {

    private Integer id;

    private Integer tag;

    private Integer nIdOne;

    private Integer nIdTwo;

    private Integer nIdThree;

    private Date time;

    private String body;

    private Integer award;

    private String desc;
}
