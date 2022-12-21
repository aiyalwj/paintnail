package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Myinfo
 */
@TableName(value ="Myinfo")
public class Myinfo implements Serializable {
    /**
     * 
     */
    @TableField(value = "User_id")
    private String userId;

    /**
     *
     */
    @TableField(value = "User_headportrait")
    private String userHeadportrait;

    /**
     *
     */
    @TableField(value = "User_background")
    private String userBackground;

    /**
     * 
     */
    @TableField(value = "User_account")
    private String userAccount;

    /**
     * 
     */
    @TableField(value = "User_school")
    private String userSchool;

    /**
     * 
     */
    @TableField(value = "Indent_start")
    private Date indentStart;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Myinfo{" +
                "userId='" + userId + '\'' +
                ", user_Headportrait='" + userHeadportrait + '\'' +
                ", user_Background='" + userBackground + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userSchool='" + userSchool + '\'' +
                ", indentStart=" + indentStart +
                '}';
    }

    public String getUserHeadportrait() {
        return userHeadportrait;
    }

    public void setUserHeadportrait(String userHeadportrait) {
        this.userHeadportrait = userHeadportrait;
    }

    public String getUserBackground() {
        return userBackground;
    }

    public void setUserBackground(String userBackground) {
        this.userBackground = userBackground;
    }

    /**
     * 
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 
     */
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
     * 
     */
    public Date getIndentStart() {
        return indentStart;
    }

    /**
     * 
     */
    public void setIndentStart(Date indentStart) {
        this.indentStart = indentStart;
    }
}