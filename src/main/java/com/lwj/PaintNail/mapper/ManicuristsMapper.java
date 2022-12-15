package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Availabletime;
import com.lwj.PaintNail.entity.Manicurists;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwj.PaintNail.entity.Projects;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wz111
* @description 针对表【Manicurists】的数据库操作Mapper
* @createDate 2022-12-06 15:59:44
* @Entity com.lwj.PaintNail.entity.Manicurists
*/
@Mapper
public interface ManicuristsMapper extends BaseMapper<Manicurists> {
    Manicurists selectManicuristsById(@Param("mid") String mid);
    Manicurists selectManicuristsByAccount(@Param("account") String account);
    List<Manicurists> listAll();
    Manicurists listMstInfo(@Param("mid") String mid);
    List<Projects> listMstPro(@Param("mid") String mid);
    List<Availabletime> listAvaTimeByMId(@Param("mid") String mid);

    List<Manicurists> searchMst(@Param("account") String account);
}




