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

    public Book() {
    }

    public Book(Integer id, String name, String author, String desc, Date updateTime, Boolean isEnd, String typeOne, String typeTwo, String typeThree, String coverPath, Integer awardSum, Integer maxWord, Integer node, Integer branch, Integer awardMouth, Integer point) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.desc = desc;
        this.updateTime = updateTime;
        this.isEnd = isEnd;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.typeThree = typeThree;
        this.coverPath = coverPath;
        this.awardSum = awardSum;
        this.maxWord = maxWord;
        this.node = node;
        this.branch = branch;
        this.awardMouth = awardMouth;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getEnd() {
        return isEnd;
    }

    public void setEnd(Boolean end) {
        isEnd = end;
    }

    public String getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }

    public String getTypeThree() {
        return typeThree;
    }

    public void setTypeThree(String typeThree) {
        this.typeThree = typeThree;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public Integer getAwardSum() {
        return awardSum;
    }

    public void setAwardSum(Integer awardSum) {
        this.awardSum = awardSum;
    }

    public Integer getMaxWord() {
        return maxWord;
    }

    public void setMaxWord(Integer maxWord) {
        this.maxWord = maxWord;
    }

    public Integer getNode() {
        return node;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Integer getAwardMouth() {
        return awardMouth;
    }

    public void setAwardMouth(Integer awardMouth) {
        this.awardMouth = awardMouth;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", desc='" + desc + '\'' +
                ", updateTime=" + updateTime +
                ", isEnd=" + isEnd +
                ", typeOne='" + typeOne + '\'' +
                ", typeTwo='" + typeTwo + '\'' +
                ", typeThree='" + typeThree + '\'' +
                ", coverPath='" + coverPath + '\'' +
                ", awardSum=" + awardSum +
                ", maxWord=" + maxWord +
                ", node=" + node +
                ", branch=" + branch +
                ", awardMouth=" + awardMouth +
                ", point=" + point +
                '}';
    }
}
