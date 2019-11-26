package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;
import com.itrip.beans.pojo.HotelExample;
import com.itrip.beans.pojo.HotelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelMapper {
    long countByExample(HotelExample example);

    int deleteByExample(HotelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HotelWithBLOBs record);

    int insertSelective(HotelWithBLOBs record);

    List<HotelWithBLOBs> selectByExampleWithBLOBs(HotelExample example);

    List<Hotel> selectByExample(HotelExample example);

    HotelWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HotelWithBLOBs record, @Param("example") HotelExample example);

    int updateByExampleWithBLOBs(@Param("record") HotelWithBLOBs record, @Param("example") HotelExample example);

    int updateByExample(@Param("record") Hotel record, @Param("example") HotelExample example);

    int updateByPrimaryKeySelective(HotelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HotelWithBLOBs record);

    int updateByPrimaryKey(Hotel record);
}