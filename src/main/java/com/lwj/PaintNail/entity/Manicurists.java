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
    @TableId(value = "Manicurist_id")
    private String manicuristId;

    /**
     * 
     */
    @TableField(value = "User_id")
    private String userId;

    /**
     * 
     */
    @TableField(value = "Manicurist_address")
    private String manicuristAddress;

    /**
     * 
     */
    @TableField(value = "Manicurist_images")
    private String manicuristImages;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
    public String getManicuristAddress() {
        return manicuristAddress;
    }

    /**
     * 
     */
    public void setManicuristAddress(String manicuristAddress) {
        this.manicuristAddress = manicuristAddress;
    }

    /**
     * 
     */
    public String getManicuristImages() {
        return manicuristImages;
    }

    /**
     * 
     */
    public void setManicuristImages(String manicuristImages) {
        this.manicuristImages = manicuristImages;
    }

    @Override
    public String toString() {
        return "Manicurists{" +
                "manicuristId='" + manicuristId + '\'' +
                ", userId='" + userId + '\'' +
                ", manicuristAddress='" + manicuristAddress + '\'' +
                ", manicuristImages='" + manicuristImages + '\'' +
                '}';
    }
}