package com.example.xsdPro.dao;

import com.example.xsdPro.model.FollowMode;
import com.example.xsdPro.model.FollowModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowModeMapper {
    int countByExample(FollowModeExample example);

    int deleteByPrimaryKey(Integer followModeId);

    int insert(FollowMode record);

    int insertSelective(FollowMode record);

    List<FollowMode> selectByExample(FollowModeExample example);

    FollowMode selectByPrimaryKey(Integer followModeId);

    int updateByExampleSelective(@Param("record") FollowMode record, @Param("example") FollowModeExample example);

    int updateByExample(@Param("record") FollowMode record, @Param("example") FollowModeExample example);

    int updateByPrimaryKeySelective(FollowMode record);

    int updateByPrimaryKey(FollowMode record);
}