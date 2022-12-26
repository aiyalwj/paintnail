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
 * @TableName Orders
 */
@TableName(value ="Orders")
public class Orders implements Serializable {

    /**
     * 订单编号
     */
    @TableField(value = "Indent_id")
    private String indentId;
    /**
     * 
     */
    @TableField(value = "Manicurist_account")
    private String manicuristAccount;

    /**
     *
     */
    @TableField(value = "User_account")
    private String userAccount;

    @TableField(value = "Time_start")
    private String timeStart;
    /**
     * 订单状态
     */
    @TableField(value = "Indent_state")
    private String indentState;


    /**
     * 项目名称
     */
    @TableField(value = "Project_name")
    private String projectName;

    /**
     * 项目费用
     */
    @TableField(value = "Project_cost")
    private Integer projectCost;

    /**
     *
     */
    @TableField(value = "Manicurist_address")
    private String manicuristAddress;

    /**
     * 订单开始时间
     */
    @TableField(value = "Indent_start")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date indentStart;

    /**
     * 订单完成时间
     */
    @TableField(value = "Indent_end")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date indentEnd;


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
     * 订单状态
     */
    public String getIndentState() {
        return indentState;
    }

    /**
     * 订单状态
     */
    public void setIndentState(String indentState) {
        this.indentState = indentState;
    }

    /**
     * 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 项目费用
     */
    public Integer getProjectCost() {
        return projectCost;
    }

    /**
     * 项目费用
     */
    public void setProjectCost(Integer projectCost) {
        this.projectCost = projectCost;
    }

    /**
     * 订单开始时间
     */
    public Date getIndentStart() {
        return indentStart;
    }

    /**
     * 订单开始时间
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
     * 订单编号
     */
    public String getIndentId() {
        return indentId;
    }

    /**
     * 订单编号
     */
    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    /**
     * 订单完成时间
     */
    public Date getIndentEnd() {
        return indentEnd;
    }

    /**
     * 订单完成时间
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


    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }
}