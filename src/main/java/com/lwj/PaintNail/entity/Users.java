package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName Users
 */
@TableName(value ="Users")
public class Users implements Serializable {
    /**
     * 
     */
    @TableId(value = "User_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 
     */
    @TableField(value = "User_account")
    private String userAccount;

    /**
     * 
     */
    @TableField(value = "User_pwd")
    private String userPwd;

    /**
     * 
     */
    @TableField(value = "User_phone")
    private String userPhone;

    /**
     * 
     */
    @TableField(value = "User_school")
    private String userSchool;

    /**
     * 盐值 MD5加密
     */
    private String salt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 
     */
    public String getUserSchool() {
        return userSchool;
    }

    /**
     * 
     */
    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    /**
     * 盐值 getter setter
     * @return
     */
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSchool='" + userSchool + '\'' +
                '}';
    }
}