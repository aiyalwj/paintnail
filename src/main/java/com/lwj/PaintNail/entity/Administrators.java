package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName Administrators
 */
@TableName(value ="Administrators")
public class Administrators implements Serializable {
    /**
     * 
     */
    @TableField(value = "Administrator_id")
    private String administratorId;

    /**
     * 
     */
    @TableField(value = "Administrator_name")
    private String administratorName;

    /**
     * 
     */
    @TableField(value = "Administrator_pwd")
    private String administratorPwd;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getAdministratorId() {
        return administratorId;
    }

    /**
     * 
     */
    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * 
     */
    public String getAdministratorName() {
        return administratorName;
    }

    /**
     * 
     */
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    /**
     * 
     */
    public String getAdministratorPwd() {
        return administratorPwd;
    }

    /**
     * 
     */
    public void setAdministratorPwd(String administratorPwd) {
        this.administratorPwd = administratorPwd;
    }

    @Override
    public String toString() {
        return "Administrators{" +
                "administratorId='" + administratorId + '\'' +
                ", administratorName='" + administratorName + '\'' +
                ", administratorPwd='" + administratorPwd + '\'' +
                '}';
    }
}