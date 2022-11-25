package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Posts
 */
@TableName(value ="Posts")
public class Posts implements Serializable {
    /**
     * 
     */
    @TableId(value = "Post_id", type = IdType.AUTO)
    private Integer postId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private Integer userId;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * 
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     */
    public void setUserId(Integer userId) {
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

    @Override
    public String toString() {
        return "Posts{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", postContents='" + postContents + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}