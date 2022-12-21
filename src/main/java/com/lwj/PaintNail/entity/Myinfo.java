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
    private String user_Headportrait;

    /**
     *
     */
    @TableField(value = "User_background")
    private String user_Background;

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

    /**
     * 
     */
    public String getUserId() {
        return userId;
    }

    public String getUser_Headportrait() {
        return user_Headportrait;
    }

    public void setUser_Headportrait(String user_Headportrait) {
        this.user_Headportrait = user_Headportrait;
    }

    public String getUser_Background() {
        return user_Background;
    }

    public void setUser_Background(String user_Background) {
        this.user_Background = user_Background;
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