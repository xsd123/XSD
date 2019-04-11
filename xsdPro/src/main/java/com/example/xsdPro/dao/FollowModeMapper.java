package com.example.xsdPro.dao;

import com.example.xsdPro.model.FollowMode;

public interface FollowModeMapper {
    int deleteByPrimaryKey(Integer followModeId);

    int insert(FollowMode record);

    int insertSelective(FollowMode record);

    FollowMode selectByPrimaryKey(Integer followModeId);

    int updateByPrimaryKeySelective(FollowMode record);

    int updateByPrimaryKey(FollowMode record);
}