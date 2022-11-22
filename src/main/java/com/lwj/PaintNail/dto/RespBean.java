package com.lwj.PaintNail.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//自定义响应类
public class RespBean {

    private long code;
    private String message;
    private String type;
    private Object obj;

    /**
     * 成功
     * @return
     */
    public static RespBean success(){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),
            RespBeanEnum.SUCCESS.getMessage(),RespBeanEnum.SUCCESS.getType(),null);
    }

    /***
     * 成功
     * @param obj
     * @return
     */
    public static RespBean success(Object obj){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),
                RespBeanEnum.SUCCESS.getMessage(),RespBeanEnum.SUCCESS.getType(),obj);
    }

    /***
     * 错误
     * @param respBeanEnum
     * @return
     */
    public static RespBean error(RespBeanEnum respBeanEnum){
        return new RespBean(respBeanEnum.getCode(),
                respBeanEnum.getMessage(),respBeanEnum.getType(),null);
    }

    /***
     * 错误
     * @param respBeanEnum
     * @param obj
     * @return
     */
    public static RespBean error(RespBeanEnum respBeanEnum,Object obj){
        return new RespBean(respBeanEnum.getCode(),
                respBeanEnum.getMessage(), respBeanEnum.getType(), obj);
    }

}
