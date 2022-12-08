package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Orders
 */
@TableName(value ="Orders")
public class Orders implements Serializable {
    /**
     * 
     */
    @TableField(value = "Manicurist_account")
    private String manicuristAccount;

    /**
     * 
     */
    @TableField(value = "Indent_state")
    private String indentState;

    /**
     * 
     */
    @TableField(value = "Project_name")
    private String projectName;

    /**
     * 
     */
    @TableField(value = "Project_cost")
    private Integer projectCost;

    /**
     * 
     */
    @TableField(value = "Indent_start")
    private Date indentStart;

    /**
     * 
     */
    @TableField(value = "Manicurist_address")
    private String manicuristAddress;

    /**
     * 
     */
    @TableField(value = "Indent_id")
    private String indentId;

    /**
     * 
     */
    @TableField(value = "Indent_end")
    private Date indentEnd;

    /**
     * 
     */
    @TableField(value = "User_account")
    private String userAccount;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
    public String getIndentState() {
        return indentState;
    }

    /**
     * 
     */
    public void setIndentState(String indentState) {
        this.indentState = indentState;
    }

    /**
     * 
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 
     */
    public Integer getProjectCost() {
        return projectCost;
    }

    /**
     * 
     */
    public void setProjectCost(Integer projectCost) {
        this.projectCost = projectCost;
    }

    /**
     * 
     */
    public Date getIndentStart() {
        return indentStart;
    }

    /**
     * 
     */
    public void setIndentStart(Date indentStart) {
        this.indentStart = indentStart;
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
    public String getIndentId() {
        return indentId;
    }

    /**
     * 
     */
    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    /**
     * 
     */
    public Date getIndentEnd() {
        return indentEnd;
    }

    /**
     * 
     */
    public void setIndentEnd(Date indentEnd) {
        this.indentEnd = indentEnd;
    }

    /**
     * 
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "manicuristAccount='" + manicuristAccount + '\'' +
                ", indentState='" + indentState + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectCost=" + projectCost +
                ", indentStart=" + indentStart +
                ", manicuristAddress='" + manicuristAddress + '\'' +
                ", indentId='" + indentId + '\'' +
                ", indentEnd=" + indentEnd +
                ", userAccount='" + userAccount + '\'' +
                '}';
    }
}