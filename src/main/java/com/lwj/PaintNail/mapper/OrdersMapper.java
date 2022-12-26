package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
* @author wz111
* @description 针对表【Orders】的数据库操作Mapper
* @createDate 2022-12-21 16:24:05
* @Entity com.lwj.PaintNail.entity.Orders
*/
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
    Integer listCount(@Param("maccount") String account);
    List<Orders> listOrd1(@Param("account") String account);

    List<Orders> listOrdSim(@Param("account") String account);
    List<Orders> listOrd2(@Param("account") String account, @Param("datetime") Date datetime);
}




