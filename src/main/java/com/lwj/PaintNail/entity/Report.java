package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Report
 */
@TableName(value ="Report")
public class Report implements Serializable {
    /**
     * 
     */
    @TableId(value = "Post_id")
    private String postId;

    /**
     * 
     */
    @TableId(value = "User_id")
    private String userId;

    /**
     * 
     */
    @TableField(value = "Report_date")
    private Date reportDate;

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
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * 
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "postId='" + postId + '\'' +
                ", userId='" + userId + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}