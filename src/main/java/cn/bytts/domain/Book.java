package cn.bytts.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:09
 * @Description 书籍类
 */
public class Book implements Serializable {

    /**书籍id 主键*/
    private Integer id;

    private String name;

    private String author;

    private String desc;

    private Date updateTime;

    private Boolean isEnd;

    private String typeOne;

    private String typeTwo;

    private String typeThree;

    private String coverPath;

    private Integer awardSum;

    private Integer maxWord;

    private Integer node;

    private Integer branch;

    private Integer awardMouth;

    private Integer point;

}
