package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Post_inner
 */
@TableName(value ="Post_inner")
public class PostInner implements Serializable {
    /**
     * 
     */
    @TableField(value = "User_id")
    private String userId;

    /**
     * 
     */
    @TableField(value = "User_account")
    private String userAccount;

    /**
     * 
     */
    @TableField(value = "Post_date")
    private Date postDate;

    /**
     * 
     */
    @TableField(value = "User_headportrait")
    private String userHeadportrait;

    /**
     * 
     */
    @TableField(value = "Post_id")
    private String postId;

    /**
     * 
     */
    @TableField(value = "Post_images")
    private String postImages;

    /**
     * 
     */
    @TableField(value = "Post_introduction")
    private String postIntroduction;

    /**
     * 
     */
    @TableField(value = "Post_contents")
    private String postContents;

    /**
     * 
     */
    @TableField(value = "Post_likes")
    private Integer postLikes;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
    public Date getPostDate() {
        return postDate;
    }

    /**
     * 
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     * 
     */
    public String getUserHeadportrait() {
        return userHeadportrait;
    }

    /**
     * 
     */
    public void setUserHeadportrait(String userHeadportrait) {
        this.userHeadportrait = userHeadportrait;
    }

    /**
     * 
     */
    public String getPostId() {
        return postId;
    }

    /**
     * 
     */
    public void setPostId(String postId) {
        this.postId = postId;
    }

    /**
     * 
     */
    public String getPostImages() {
        return postImages;
    }

    /**
     * 
     */
    public void setPostImages(String postImages) {
        this.postImages = postImages;
    }

    /**
     * 
     */
    public String getPostIntroduction() {
        return postIntroduction;
    }

    /**
     * 
     */
    public void setPostIntroduction(String postIntroduction) {
        this.postIntroduction = postIntroduction;
    }

    /**
     * 
     */
    public String getPostContents() {
        return postContents;
    }

    /**
     * 
     */
    public void setPostContents(String postContents) {
        this.postContents = postContents;
    }

    /**
     * 
     */
    public Integer getPostLikes() {
        return postLikes;
    }

    /**
     * 
     */
    public void setPostLikes(Integer postLikes) {
        this.postLikes = postLikes;
    }
}