package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleSystem;
import com.example.xsdPro.model.VehicleSystemExample;
import com.example.xsdPro.model.VehicleSystemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleSystemMapper {
    int countByExample(VehicleSystemExample example);

    int deleteByPrimaryKey(VehicleSystemKey key);

    int insert(VehicleSystem record);

    int insertSelective(VehicleSystem record);

    List<VehicleSystem> selectByExample(VehicleSystemExample example);

    VehicleSystem selectByPrimaryKey(VehicleSystemKey key);

    int updateByExampleSelective(@Param("record") VehicleSystem record, @Param("example") VehicleSystemExample example);

    int updateByExample(@Param("record") VehicleSystem record, @Param("example") VehicleSystemExample example);

    int updateByPrimaryKeySelective(VehicleSystem record);

    int updateByPrimaryKey(VehicleSystem record);
}