package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleTypePackage;
import com.example.xsdPro.model.VehicleTypePackageExample;
import com.example.xsdPro.model.VehicleTypePackageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleTypePackageMapper {
    int countByExample(VehicleTypePackageExample example);

    int deleteByPrimaryKey(VehicleTypePackageKey key);

    int insert(VehicleTypePackage record);

    int insertSelective(VehicleTypePackage record);

    List<VehicleTypePackage> selectByExample(VehicleTypePackageExample example);

    VehicleTypePackage selectByPrimaryKey(VehicleTypePackageKey key);

    int updateByExampleSelective(@Param("record") VehicleTypePackage record, @Param("example") VehicleTypePackageExample example);

    int updateByExample(@Param("record") VehicleTypePackage record, @Param("example") VehicleTypePackageExample example);

    int updateByPrimaryKeySelective(VehicleTypePackage record);

    int updateByPrimaryKey(VehicleTypePackage record);
}