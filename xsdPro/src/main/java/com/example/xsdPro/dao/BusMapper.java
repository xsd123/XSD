package com.example.xsdPro.dao;

import com.example.xsdPro.model.Bus;
import com.example.xsdPro.model.BusExample;
import com.example.xsdPro.model.BusKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusMapper {
    int countByExample(BusExample example);

    int deleteByPrimaryKey(BusKey key);

    int insert(Bus record);

    int insertSelective(Bus record);

    List<Bus> selectByExample(BusExample example);

    Bus selectByPrimaryKey(BusKey key);

    int updateByExampleSelective(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByExample(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByPrimaryKeySelective(Bus record);

    int updateByPrimaryKey(Bus record);
}