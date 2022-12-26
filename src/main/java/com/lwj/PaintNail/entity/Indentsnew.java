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
 * @TableName IndentsNew
 */
@TableName(value ="IndentsNew")
public class Indentsnew implements Serializable {
    /**
     * 用户编号
     */
    @TableId(value = "User_id")
    private String userId;

    /**
     * 时段编号
     */
    @TableId(value = "Time_id")
    private String timeId;

    /**
     *
     */
    @TableId(value = "Project_idS")
    private String projectIds;

    /**
     * 美甲师编号
     */
    @TableId(value = "Manicurist_id")
    private String manicuristId;

    /**
     * 订单编号
     */
    @TableId(value = "Indent_id")
    private String indentId;



    /**
     * 订单状态
     */
    @TableField(value = "Indent_state")
    private String indentState;

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

    /**
     * 订单评价
     */
    @TableField(value = "Indent_comment")
    private String indentComment;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 时段编号
     */
    public String getTimeId() {
        return timeId;
    }

    /**
     * 时段编号
     */
    public void setTimeId(String timeId) {
        this.timeId = timeId;
    }


    /**
     * 美甲师编号
     */
    public String getManicuristId() {
        return manicuristId;
    }

    /**
     * 美甲师编号
     */
    public void setManicuristId(String manicuristId) {
        this.manicuristId = manicuristId;
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
     * 
     */
    public String getProjectIds() {
        return projectIds;
    }

    /**
     * 
     */
    public void setProjectIds(String projectIds) {
        this.projectIds = projectIds;
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
     * 订单评价
     */
    public String getIndentComment() {
        return indentComment;
    }

    /**
     * 订单评价
     */
    public void setIndentComment(String indentComment) {
        this.indentComment = indentComment;
    }
}