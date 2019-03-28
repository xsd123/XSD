package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleType;
import com.example.xsdPro.model.VehicleTypeExample;
import com.example.xsdPro.model.VehicleTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleTypeMapper {
    int countByExample(VehicleTypeExample example);

    int deleteByPrimaryKey(VehicleTypeKey key);

    int insert(VehicleType record);

    int insertSelective(VehicleType record);

    List<VehicleType> selectByExample(VehicleTypeExample example);

    VehicleType selectByPrimaryKey(VehicleTypeKey key);

    int updateByExampleSelective(@Param("record") VehicleType record, @Param("example") VehicleTypeExample example);

    int updateByExample(@Param("record") VehicleType record, @Param("example") VehicleTypeExample example);

    int updateByPrimaryKeySelective(VehicleType record);

    int updateByPrimaryKey(VehicleType record);
}