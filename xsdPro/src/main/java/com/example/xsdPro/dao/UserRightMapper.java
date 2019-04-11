package com.example.xsdPro.dao;

import com.example.xsdPro.model.UserRight;
import com.example.xsdPro.model.UserRightKey;

public interface UserRightMapper {
    int deleteByPrimaryKey(UserRightKey key);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    UserRight selectByPrimaryKey(UserRightKey key);

    int updateByPrimaryKeySelective(UserRight record);

    int updateByPrimaryKey(UserRight record);
}