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
 * @TableName Projects 项目表
 */
@TableName(value ="Projects")
public class Projects implements Serializable {
    /**
     * 
     */
    @TableId(value = "Project_id")
    private String projectId;

    /**
     * 
     */
    @TableField(value = "Manicurist_id")
    private String manicuristId;

    /**
     *
     */
    @TableField(value = "Manicurist_name")
    private String manicuristName;

    /**
     * 
     */
    @TableField(value = "Project_cost")
    private Integer projectCost;

    /**
     * 
     */
    @TableField(value = "Project_name")
    private String projectName;

    /**
     * 
     */
    @TableField(value = "Project_time")
    @JsonFormat(pattern="HH:mm:ss",timezone = "GMT+8")
    private Date projectTime;

    /**
     * 
     */
    @TableField(value = "Project_content")
    private String projectContent;

    /**
     * 
     */
    @TableField(value = "Project_images")
    private String projectImages;

    @TableField(value = "Service_type")
    private String serviceType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
    public String getManicuristName() {
        return manicuristName;
    }

    /**
     *
     */
    public void setManicuristName(String manicuristName) {
        this.manicuristName = manicuristName;
    }

    public Integer getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(Integer projectCost) {
        this.projectCost = projectCost;
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
    public Date getProjectTime() {
        return projectTime;
    }

    /**
     * 
     */
    public void setProjectTime(Date projectTime) {
        this.projectTime = projectTime;
    }

    /**
     * 
     */
    public String getProjectContent() {
        return projectContent;
    }

    /**
     * 
     */
    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    /**
     * 
     */
    public String getProjectImages() {
        return projectImages;
    }

    /**
     * 
     */
    public void setProjectImages(String projectImages) {
        this.projectImages = projectImages;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "projectId='" + projectId + '\'' +
                ", manicuristId='" + manicuristId + '\'' +
                ", manicuristName='" + manicuristName + '\'' +
                ", projectCost=" + projectCost +
                ", projectName='" + projectName + '\'' +
                ", projectTime=" + projectTime +
                ", projectContent='" + projectContent + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", projectImages='" + projectImages + '\'' +
                '}';
    }
}