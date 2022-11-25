package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName Manicurists
 */
@TableName(value ="Manicurists")
public class Manicurists implements Serializable {
    /**
     * 
     */
    @TableId(value = "Manicurist_id", type = IdType.AUTO)
    private Integer manicuristId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private Integer userId;

    /**
     * 
     */
    @TableField(value = "Manicurist_address")
    private String manicuristAddress;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getManicuristId() {
        return manicuristId;
    }

    /**
     * 
     */
    public void setManicuristId(Integer manicuristId) {
        this.manicuristId = manicuristId;
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
    public String getManicuristAddress() {
        return manicuristAddress;
    }

    /**
     * 
     */
    public void setManicuristAddress(String manicuristAddress) {
        this.manicuristAddress = manicuristAddress;
    }

    @Override
    public String toString() {
        return "Manicurists{" +
                "manicuristId=" + manicuristId +
                ", userId=" + userId +
                ", manicuristAddress='" + manicuristAddress + '\'' +
                '}';
    }
}