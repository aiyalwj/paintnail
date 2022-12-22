package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName Post_out
 */
@TableName(value ="Post_out")
public class PostOut implements Serializable {
    /**
     * 
     */
    @TableField(value = "Post_id")
    private String postId;

    /**
     * 
     */
    @TableField(value = "Post_introduction")
    private String postIntroduction;

    /**
     * 
     */
    @TableField(value = "Post_images")
    private String postImages;

    public PostOut() {
    }

    /**
     * 
     */
    @TableField(value = "User_account")
    private String userAccount;

    /**
     * 
     */
    @TableField(value = "User_headportrait")
    private String userHeadportrait;

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