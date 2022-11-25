package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Indents
 */
@TableName(value ="Indents")
public class Indents implements Serializable {
    /**
     * 
     */
    @TableId(value = "Indent_no", type = IdType.AUTO)
    private Integer indentNo;

    /**
     * 
     */
    @TableId(value = "User_id")
    private Integer userId;

    /**
     * 
     */
    @TableId(value = "Time_id")
    private Integer timeId;

    /**
     * 
     */
    @TableId(value = "Project_id")
    private String projectId;

    /**
     * 
     */
    @TableId(value = "Manicurist_id")
    private Integer manicuristId;

    /**
     * 
     */
    @TableField(value = "Indent_state")
    private String indentState;

    /**
     * 
     */
    @TableField(value = "Indent_start")
    private Date indentStart;

    /**
     * 
     */
    @TableField(value = "Indent_end")
    private Date indentEnd;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getIndentNo() {
        return indentNo;
    }

    /**
     * 
     */
    public void setIndentNo(Integer indentNo) {
        this.indentNo = indentNo;
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
    public Integer getTimeId() {
        return timeId;
    }

    /**
     * 
     */
    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    /**
     * 
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

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
    public Date getIndentEnd() {
        return indentEnd;
    }

    /**
     * 
     */
    public void setIndentEnd(Date indentEnd) {
        this.indentEnd = indentEnd;
    }

    @Override
    public String toString() {
        return "Indents{" +
                "indentNo=" + indentNo +
                ", userId=" + userId +
                ", timeId=" + timeId +
                ", projectId='" + projectId + '\'' +
                ", manicuristId=" + manicuristId +
                ", indentState='" + indentState + '\'' +
                ", indentStart=" + indentStart +
                ", indentEnd=" + indentEnd +
                '}';
    }
}