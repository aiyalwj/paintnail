package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Time
 */
@TableName(value ="Time")
public class Time implements Serializable {
    /**
     * 
     */
    @TableId(value = "Time_id")
    private String timeId;

    /**
     * 
     */
    @TableField(value = "Time_name")
    private String timeName;

    /**
     * 
     */
    @TableField(value = "Time_start")
    private Date timeStart;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getTimeId() {
        return timeId;
    }

    /**
     * 
     */
    public void setTimeId(String timeId) {
        this.timeId = timeId;
    }

    /**
     * 
     */
    public String getTimeName() {
        return timeName;
    }

    /**
     * 
     */
    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }

    /**
     * 
     */
    public Date getTimeStart() {
        return timeStart;
    }

    /**
     * 
     */
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public String toString() {
        return "Time{" +
                "timeId='" + timeId + '\'' +
                ", timeName='" + timeName + '\'' +
                ", timeStart=" + timeStart +
                '}';
    }
}