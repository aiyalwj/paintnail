package com.lwj.PaintNail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
//响应类枚举
public enum RespBeanEnum {
    //成功
    SUCCESS(200,"成功","success"),

    //错误
    ERROR(500,"错误","error"),

    //用户名 密码 输入为空
    LOGIN_INPUT_EMPTY(4001,"请输入账号和密码！","warning"),

    //账号 输入错误 没有找到
    USER_ACCOUNT_NOT_FOUND(4002,"该用户不存在！","error"),

    //美甲师账号 输入错误 没有找到
    MANICURIST_ACCOUNT_NOT_FOUND(4012,"该美甲师不存在！","error"),

    //密码错误 登录错误
    LOGIN_ERROR(4003,"账号密码输入错误！","error"),

    //用户账号account 不能为空
    USER_ACCOUNT_EMPTY(4004,"用户账号不能为空！","warning"),

    //美甲师账号account 不能为空
    MANICURIST_ACCOUNT_EMPTY(4014,"美甲师账号不能为空！","warning");

    //电话信息 为空
    //PHONE_INFO_EMPTY("5000","")


    private final Integer code;
    private final String message;
    private final String type;


}
