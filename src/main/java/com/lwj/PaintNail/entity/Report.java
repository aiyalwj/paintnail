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
    @TableId(value = "Post_id", type = IdType.AUTO)
    private Integer postId;

    /**
     * 
     */
    @TableId(value = "User_id")
    private Integer userId;

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
                "postId=" + postId +
                ", userId=" + userId +
                ", reportDate=" + reportDate +
                '}';
    }
}