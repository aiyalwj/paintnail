package com.lwj.PaintNail.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Getcurrenttime_String {
    public Getcurrenttime_String(){
    }

    public static String getDate_String(){
        Timestamp currenttime = Getcurrenttime.getDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//定义格式，不显示毫秒
        return (df.format(currenttime));
    }
    public static void main(String[] args){
        System.out.println(getDate_String());
    }

}
