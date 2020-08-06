package cn.bytts.domain;

import java.io.Serializable;

/**
 * @Author LZT
 * @Date 2020/7/21
 * @Time 18:08
 * @Description 用户类
 */
public class User implements Serializable {

    private Integer tag;

    private String email;

    private String password;

    public User() {
    }

    public User(Integer tag, String email, String password) {
        this.tag = tag;
        this.email = email;
        this.password = password;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "tag=" + tag +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
