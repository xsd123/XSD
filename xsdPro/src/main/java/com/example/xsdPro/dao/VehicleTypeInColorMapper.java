package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleTypeInColor;
import com.example.xsdPro.model.VehicleTypeInColorExample;
import com.example.xsdPro.model.VehicleTypeInColorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleTypeInColorMapper {
    int countByExample(VehicleTypeInColorExample example);

    int deleteByPrimaryKey(VehicleTypeInColorKey key);

    int insert(VehicleTypeInColor record);

    int insertSelective(VehicleTypeInColor record);

    List<VehicleTypeInColor> selectByExample(VehicleTypeInColorExample example);

    VehicleTypeInColor selectByPrimaryKey(VehicleTypeInColorKey key);

    int updateByExampleSelective(@Param("record") VehicleTypeInColor record, @Param("example") VehicleTypeInColorExample example);

    int updateByExample(@Param("record") VehicleTypeInColor record, @Param("example") VehicleTypeInColorExample example);

    int updateByPrimaryKeySelective(VehicleTypeInColor record);

    int updateByPrimaryKey(VehicleTypeInColor record);
}