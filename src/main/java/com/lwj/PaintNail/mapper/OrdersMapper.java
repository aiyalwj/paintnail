package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
* @author wz111
* @description 针对表【Orders】的数据库操作Mapper
* @createDate 2022-12-07 18:40:50
* @Entity com.lwj.PaintNail.entity.Orders
*/
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
    Integer listCount(@Param("maccount") String account);
    List<Orders> listOrd1(@Param("account") String account);

    List<Orders> listOrdSim(@Param("account") String account);
    List<Orders> listOrd2(@Param("account") String account,@Param("datetime") Date datetime);
}




