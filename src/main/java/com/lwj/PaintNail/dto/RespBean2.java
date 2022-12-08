package com.lwj.PaintNail.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//自定义响应类
public class RespBean2 {

    private long code;
    private String message;
    private String type;
    private Object obj;
    private Object obj2;

    /**
     * 成功
     * @return
     */
    public static RespBean2 success(){
        return new RespBean2(RespBeanEnum.SUCCESS.getCode(),
            RespBeanEnum.SUCCESS.getMessage(),RespBeanEnum.SUCCESS.getType(),null,null);
    }

    /***
     * 成功
     * @param obj
     * @return
     */
    public static RespBean2 success(Object obj,Object obj2){
        return new RespBean2(RespBeanEnum.SUCCESS.getCode(),
                RespBeanEnum.SUCCESS.getMessage(),RespBeanEnum.SUCCESS.getType(),obj,obj2);
    }


    /***
     * 错误
     * @param respBeanEnum
     * @return
     */
    public static RespBean2 error(RespBeanEnum respBeanEnum){
        return new RespBean2(respBeanEnum.getCode(),
                respBeanEnum.getMessage(),respBeanEnum.getType(),null,null);
    }

    /***
     * 错误
     * @param respBeanEnum
     * @param obj
     * @return
     */
    public static RespBean2 error(RespBeanEnum respBeanEnum, Object obj){
        return new RespBean2(respBeanEnum.getCode(),
                respBeanEnum.getMessage(), respBeanEnum.getType(), obj,obj);
    }

}
