package com.lwj.PaintNail.utils;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Getcurrenttime {

    public Getcurrenttime(){
    }

    public static java.sql.Timestamp getDate(){
        long startTime = System.currentTimeMillis();
        Timestamp current_time = new Timestamp(startTime);
        return current_time;
    }
    public static void main(String[] args){
        System.out.println(getDate());
    }

}
