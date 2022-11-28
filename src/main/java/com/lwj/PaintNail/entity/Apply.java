package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Apply
 */
@TableName(value ="Apply")
public class Apply implements Serializable {
    /**
     * 
     */
    @TableId(value = "Apply_id")
    private String applyId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private String userId;

    /**
     * 
     */
    @TableField(value = "Apply_time")
    private Date applyTime;

    /**
     * 
     */
    @TableField(value = "Apply_video")
    private String applyVideo;

    /**
     * 
     */
    @TableField(value = "Apply_state")
    private String applyState;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
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
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 
     */
    public String getApplyVideo() {
        return applyVideo;
    }

    /**
     * 
     */
    public void setApplyVideo(String applyVideo) {
        this.applyVideo = applyVideo;
    }

    /**
     * 
     */
    public String getApplyState() {
        return applyState;
    }

    /**
     * 
     */
    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "applyId='" + applyId + '\'' +
                ", userId='" + userId + '\'' +
                ", applyTime=" + applyTime +
                ", applyVideo='" + applyVideo + '\'' +
                ", applyState='" + applyState + '\'' +
                '}';
    }
}