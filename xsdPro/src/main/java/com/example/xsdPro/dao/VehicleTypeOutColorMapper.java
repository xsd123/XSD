package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleTypeOutColor;
import com.example.xsdPro.model.VehicleTypeOutColorExample;
import com.example.xsdPro.model.VehicleTypeOutColorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleTypeOutColorMapper {
    int countByExample(VehicleTypeOutColorExample example);

    int deleteByPrimaryKey(VehicleTypeOutColorKey key);

    int insert(VehicleTypeOutColor record);

    int insertSelective(VehicleTypeOutColor record);

    List<VehicleTypeOutColor> selectByExample(VehicleTypeOutColorExample example);

    VehicleTypeOutColor selectByPrimaryKey(VehicleTypeOutColorKey key);

    int updateByExampleSelective(@Param("record") VehicleTypeOutColor record, @Param("example") VehicleTypeOutColorExample example);

    int updateByExample(@Param("record") VehicleTypeOutColor record, @Param("example") VehicleTypeOutColorExample example);

    int updateByPrimaryKeySelective(VehicleTypeOutColor record);

    int updateByPrimaryKey(VehicleTypeOutColor record);
}