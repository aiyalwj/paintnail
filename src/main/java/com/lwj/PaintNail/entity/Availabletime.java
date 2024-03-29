package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName AvailableTime 可用时段表
 */
@TableName(value ="AvailableTime")
public class Availabletime implements Serializable {
    /**
     * 
     */
    @TableId(value = "Time_id")
    private String timeId;

    /**
     * 
     */
    @TableId(value = "Manicurist_id")
    private String manicuristId;



    /**
     * 
     */
    @TableField(value = "AvailableTime_state")
    private String availabletimeState;

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

    @Override
    public String toString() {
        return "Availabletime{" +
                "timeId='" + timeId + '\'' +
                ", manicuristId='" + manicuristId + '\'' +
                ", availabletimeState='" + availabletimeState + '\'' +
                '}';
    }
}