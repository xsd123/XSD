package com.example.xsdPro.dao;

import com.example.xsdPro.model.UserRange;
import com.example.xsdPro.model.UserRangeKey;

public interface UserRangeMapper {
    int deleteByPrimaryKey(UserRangeKey key);

    int insert(UserRange record);

    int insertSelective(UserRange record);

    UserRange selectByPrimaryKey(UserRangeKey key);

    int updateByPrimaryKeySelective(UserRange record);

    int updateByPrimaryKey(UserRange record);
}