package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 *
 * @TableName Manicurists 美甲师
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
    @TableField(value = "Manicurist_account")
    private String manicuristAccount;

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

    /**
     *
     */
    @TableField(value = "Manicurist_phone")
    private String manicuristPhone;

    /**
     *
     */
    @TableField(value = "Manicurist_profile")
    private String manicuristProfile;

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
    public String getManicuristAccount() {
        return manicuristAccount;
    }

    /**
     *
     */
    public void setManicuristAccount(String manicuristAccount) {
        this.manicuristAccount = manicuristAccount;
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

    /**
     *
     */
    public String getManicuristPhone() {
        return manicuristPhone;
    }

    /**
     *
     */
    public void setManicuristPhone(String manicuristPhone) {
        this.manicuristPhone = manicuristPhone;
    }

    /**
     *
     */
    public String getManicuristProfile() {
        return manicuristProfile;
    }

    /**
     *
     */
    public void setManicuristProfile(String manicuristProfile) {
        this.manicuristProfile = manicuristProfile;
    }
}