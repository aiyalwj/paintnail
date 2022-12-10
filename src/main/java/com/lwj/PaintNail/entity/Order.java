package com.lwj.PaintNail.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    @TableField("")
    private String Mst_account;
    private String Ind_state;
    private String Pro_name;
    private Integer Pro_cost;
    private Date Ind_start;
    private String Mst_address;
    private String Ind_id;
    private Date Ind_end;
    private String User_account;

    public Order(){

    }
    public Order(String mst_account, String ind_state, String pro_name, Integer pro_cost, Date ind_start, String mst_address, String ind_id, Date ind_end, String user_account) {
        Mst_account = mst_account;
        Ind_state = ind_state;
        Pro_name = pro_name;
        Pro_cost = pro_cost;
        Ind_start = ind_start;
        Mst_address = mst_address;
        Ind_id = ind_id;
        Ind_end = ind_end;
        User_account = user_account;
    }
    public Order(String mst_account){
        this.Mst_account = mst_account;
    }

    public String getMst_account() {
        return Mst_account;
    }

    public void setMst_account(String mst_account) {
        Mst_account = mst_account;
    }

    public String getInd_state() {
        return Ind_state;
    }

    public void setInd_state(String ind_state) {
        Ind_state = ind_state;
    }

    public String getPro_name() {
        return Pro_name;
    }

    public void setPro_name(String pro_name) {
        Pro_name = pro_name;
    }

    public Integer getPro_cost() {
        return Pro_cost;
    }

    public void setPro_cost(Integer pro_cost) {
        Pro_cost = pro_cost;
    }

    public Date getInd_start() {
        return Ind_start;
    }

    public void setInd_start(Date ind_start) {
        Ind_start = ind_start;
    }

    public String getMst_address() {
        return Mst_address;
    }

    public void setMst_address(String mst_address) {
        Mst_address = mst_address;
    }

    public String getInd_id() {
        return Ind_id;
    }

    public void setInd_id(String ind_id) {
        Ind_id = ind_id;
    }

    public Date getInd_end() {
        return Ind_end;
    }

    public void setInd_end(Date ind_end) {
        Ind_end = ind_end;
    }

    public String getUser_account() {
        return User_account;
    }

    public void setUser_account(String user_account) {
        User_account = user_account;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Mst_account='" + Mst_account + '\'' +
                ", Ind_state='" + Ind_state + '\'' +
                ", Pro_name='" + Pro_name + '\'' +
                ", Pro_cost=" + Pro_cost +
                ", Ind_start=" + Ind_start +
                ", Mst_address='" + Mst_address + '\'' +
                ", Ind_id='" + Ind_id + '\'' +
                ", Ind_end=" + Ind_end +
                ", User_account='" + User_account + '\'' +
                '}';
    }
}
