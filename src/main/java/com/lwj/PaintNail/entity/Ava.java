package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Ava
 */
@TableName(value ="Ava")
public class Ava implements Serializable {
    /**
     * 
     */
    @TableField(value = "Time_start")
    @JsonFormat(pattern="HH:mm",timezone = "GMT+8")
    private Date timeStart;

    /**
     * 
     */
    @TableField(value = "Manicurist_id")
    private String manicuristId;

    /**
     * 
     */
    @TableField(value = "AvailableTime_state")
    private String availabletimeState;

    @TableField(value ="Time_interval")
    private String timeInterval;

    @TableField(value ="Time_id")
    private String timeId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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

    /**
     * 
     */
    public String getManicuristId() {
        return manicuristId;
    }

    /**
     * 
     */
    public void setManicuristId(String manicuristId) {
        this.manicuristId = manicuristId;
    }

    /**
     * 
     */
    public String getAvailabletimeState() {
        return availabletimeState;
    }

    /**
     * 
     */
    public void setAvailabletimeState(String availabletimeState) {
        this.availabletimeState = availabletimeState;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId;
    }
}