package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName Indents 预约表
 */
@TableName(value ="Indents")
public class Indents implements Serializable {
    /**
     * 
     */
    @TableId(value = "User_id")
    private String userId;

    /**
     * 
     */
    @TableId(value = "Time_id")
    private String timeId;

    /**
     * 
     */
    @TableId(value = "Project_id")
    private String projectId;

    @TableId(value = "Project_idS")
    private String projectIds;
    /**
     * 
     */
    @TableId(value = "Manicurist_id")
    private String manicuristId;

    /**
     * 
     */
    @TableId(value = "Indent_id")
    private String indentId;

    /**
     * 
     */
    @TableField(value = "Indent_state")
    private String indentState;

    /**
     * 
     */
    @TableField(value = "Indent_start")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date indentStart;

    /**
     * 
     */
    @TableField(value = "Indent_end")
    private Date indentEnd;

    /**
     * 
     */
    @TableField(value = "Indent_comment")
    private String indentComment;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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

    /**
     * 
     */
    public String getIndentComment() {
        return indentComment;
    }

    /**
     * 
     */
    public void setIndentComment(String indentComment) {
        this.indentComment = indentComment;
    }

    public String getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(String projectIds) {
        this.projectIds = projectIds;
    }

    @Override
    public String toString() {
        return "Indents{" +
                "userId='" + userId + '\'' +
                ", timeId='" + timeId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", projectIds='" + projectIds + '\'' +
                ", manicuristId='" + manicuristId + '\'' +
                ", indentId='" + indentId + '\'' +
                ", indentState='" + indentState + '\'' +
                ", indentStart=" + indentStart +
                ", indentEnd=" + indentEnd +
                ", indentComment='" + indentComment + '\'' +
                '}';
    }
}