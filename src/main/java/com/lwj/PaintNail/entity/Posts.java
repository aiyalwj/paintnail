package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Posts 帖子表
 */
@TableName(value ="Posts")
public class Posts implements Serializable {
    /**
     * 
     */
    @TableId(value = "Post_id")
    private String postId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private String userId;

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
    @TableField(value = "Post_date")
    private Date postDate;

    /**
     *
     */
    @TableField(value = "Post_likes")
    private Integer postLikes;

    /**
     * 
     */
    @TableField(value = "Post_images")
    private String postImages;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public String getPostIntroduction() {
        return postIntroduction;
    }

    public void setPostIntroduction(String postIntroduction) {
        this.postIntroduction = postIntroduction;
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
    public Integer getPostLikes() {
        return postLikes;
    }

    /**
     *
     */
    public void setPostLikes(Integer postLikes) {
        this.postLikes = postLikes;
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

    @Override
    public String toString() {
        return "Posts{" +
                "postId='" + postId + '\'' +
                ", userId='" + userId + '\'' +
                ", postContents='" + postContents + '\'' +
                ", postDate=" + postDate +
                ", postImages='" + postImages + '\'' +
                '}';
    }
}