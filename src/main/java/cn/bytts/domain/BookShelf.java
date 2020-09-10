package cn.bytts.domain;

import java.io.Serializable;
import java.util.List;

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

    private List<Book> books;

    private Integer percent;

    private Boolean isUpdate;

    public BookShelf() {
    }

    public BookShelf(Integer tag, Integer id, List<Book> books, Integer percent, Boolean isUpdate) {
        this.tag = tag;
        this.id = id;
        this.books = books;
        this.percent = percent;
        this.isUpdate = isUpdate;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Boolean getUpdate() {
        return isUpdate;
    }

    public void setUpdate(Boolean update) {
        isUpdate = update;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "tag=" + tag +
                ", id=" + id +
                ", percent=" + percent +
                ", isUpdate=" + isUpdate +
                '}';
    }
}
