package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName Collection
 */
@TableName(value ="Collection")
public class Collection_post implements Serializable {
    /**
     * 
     */
    @TableId(value = "Collection_id")
    private String collectionId;

    /**
     * 
     */
    @TableField(value = "Post_id")
    private String postId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private String userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * 
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
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
}