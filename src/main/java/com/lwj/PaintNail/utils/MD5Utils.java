package com.lwj.PaintNail.utils;

import org.apache.commons.codec.digest.DigestUtils;


public class MD5Utils {
    /**
     * MD5Utils 加密 工具类
     * @param src
     * @return
     */
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    /**
     * 固定salt
     */
    private static final String salt="1a2b3c4d";

    /**
     * 第一次加密 明文密码与固定盐进行拼装后再进行MD5加密
     * @param inputPass 密码
     * @return
     */
    public static String inputPassToFormPass(String inputPass){
        String str =""+salt.charAt(0)+salt.charAt(2)+inputPass+salt.charAt(5)+salt.charAt(4);
        System.out.println(str);
        return md5(str);
    }

    /**
     *第二次加密 将form表单(服务端)中的密码转换成数据库中存储的密码
     * @param formPass 密码
     * @param salt 随机盐
     * @return
     */
    public static String formPassToDBPass(String formPass,String salt){
        String str =""+salt.charAt(0)+salt.charAt(2)+formPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    /**
     *输入的明文密码转换成数据库中的密码
     * @param inputPass
     * @param saltDB
     * @return
     */
    public static String inputPassToDBPass(String inputPass,String saltDB){
        String formPass =inputPassToFormPass(inputPass);
        String dbPass=formPassToDBPass(formPass,saltDB);
        return dbPass;
    }
}
