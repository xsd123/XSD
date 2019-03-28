package com.example.xsdPro.dao;

import com.example.xsdPro.model.BusInOutLog;
import com.example.xsdPro.model.BusInOutLogExample;
import com.example.xsdPro.model.BusInOutLogKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusInOutLogMapper {
    int countByExample(BusInOutLogExample example);

    int deleteByPrimaryKey(BusInOutLogKey key);

    int insert(BusInOutLog record);

    int insertSelective(BusInOutLog record);

    List<BusInOutLog> selectByExample(BusInOutLogExample example);

    BusInOutLog selectByPrimaryKey(BusInOutLogKey key);

    int updateByExampleSelective(@Param("record") BusInOutLog record, @Param("example") BusInOutLogExample example);

    int updateByExample(@Param("record") BusInOutLog record, @Param("example") BusInOutLogExample example);

    int updateByPrimaryKeySelective(BusInOutLog record);

    int updateByPrimaryKey(BusInOutLog record);
}