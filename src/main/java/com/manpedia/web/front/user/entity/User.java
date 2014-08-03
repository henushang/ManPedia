package com.manpedia.web.front.user.entity;

import com.manpedia.web.base.entity.BaseEntity;
import com.manpedia.web.front.user.eentity.EGender;

import java.sql.Date;

/**
 * @Description: 用户实体
 * @Author: Jianguo Shang
 * @Createtime: 2014-07-08 22:09
 */
public class User extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private EGender gender;

    /**
     * 生日
     */
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }
}
