package com.example.xsdPro.dao;

import com.example.xsdPro.model.WorkType;
import com.example.xsdPro.model.WorkTypeExample;
import com.example.xsdPro.model.WorkTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTypeMapper {
    int countByExample(WorkTypeExample example);

    int deleteByPrimaryKey(WorkTypeKey key);

    int insert(WorkType record);

    int insertSelective(WorkType record);

    List<WorkType> selectByExample(WorkTypeExample example);

    WorkType selectByPrimaryKey(WorkTypeKey key);

    int updateByExampleSelective(@Param("record") WorkType record, @Param("example") WorkTypeExample example);

    int updateByExample(@Param("record") WorkType record, @Param("example") WorkTypeExample example);

    int updateByPrimaryKeySelective(WorkType record);

    int updateByPrimaryKey(WorkType record);
}