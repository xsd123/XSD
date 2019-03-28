package com.example.xsdPro.dao;

import com.example.xsdPro.model.UserRange;
import com.example.xsdPro.model.UserRangeExample;
import com.example.xsdPro.model.UserRangeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRangeMapper {
    int countByExample(UserRangeExample example);

    int deleteByPrimaryKey(UserRangeKey key);

    int insert(UserRange record);

    int insertSelective(UserRange record);

    List<UserRange> selectByExample(UserRangeExample example);

    UserRange selectByPrimaryKey(UserRangeKey key);

    int updateByExampleSelective(@Param("record") UserRange record, @Param("example") UserRangeExample example);

    int updateByExample(@Param("record") UserRange record, @Param("example") UserRangeExample example);

    int updateByPrimaryKeySelective(UserRange record);

    int updateByPrimaryKey(UserRange record);
}