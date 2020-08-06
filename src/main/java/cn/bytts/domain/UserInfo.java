package cn.bytts.domain;

import java.io.Serializable;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:09
 * @Description 用户信息类
 */
public class UserInfo implements Serializable {

    private Integer tag;

    private Integer grade;

    private String name;

    private Integer point;

    private String sex;

    private Integer age;

    private String hobby;

    private Integer award;

    private Integer exp;

    private String desc;

    private String headPath;


    public UserInfo() {
    }

    public UserInfo(Integer tag, Integer grade, String name, Integer point, String sex, Integer age, String hobby, Integer award, Integer exp, String desc, String headPath) {
        this.tag = tag;
        this.grade = grade;
        this.name = name;
        this.point = point;
        this.sex = sex;
        this.age = age;
        this.hobby = hobby;
        this.award = award;
        this.exp = exp;
        this.desc = desc;
        this.headPath = headPath;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getAward() {
        return award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "tag=" + tag +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", award=" + award +
                ", exp=" + exp +
                ", desc='" + desc + '\'' +
                ", headPath='" + headPath + '\'' +
                '}';
    }
}
