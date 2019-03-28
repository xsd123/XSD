package com.example.xsdPro.dao;

import com.example.xsdPro.model.UserRight;
import com.example.xsdPro.model.UserRightExample;
import com.example.xsdPro.model.UserRightKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRightMapper {
    int countByExample(UserRightExample example);

    int deleteByPrimaryKey(UserRightKey key);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    List<UserRight> selectByExample(UserRightExample example);

    UserRight selectByPrimaryKey(UserRightKey key);

    int updateByExampleSelective(@Param("record") UserRight record, @Param("example") UserRightExample example);

    int updateByExample(@Param("record") UserRight record, @Param("example") UserRightExample example);

    int updateByPrimaryKeySelective(UserRight record);

    int updateByPrimaryKey(UserRight record);
}