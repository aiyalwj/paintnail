package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
    @TableId(value = "Apply_id", type = IdType.AUTO)
    private Integer applyId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private Integer userId;

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
    public Integer getApplyId() {
        return applyId;
    }

    /**
     * 
     */
    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
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
                "applyId=" + applyId +
                ", userId=" + userId +
                ", applyTime=" + applyTime +
                ", applyVideo='" + applyVideo + '\'' +
                ", applyState='" + applyState + '\'' +
                '}';
    }
}