package com.example.xsdPro.dao;

import com.example.xsdPro.model.User;
import com.example.xsdPro.model.UserKey;
import com.example.xsdPro.model.vo.UserVo;

public interface UserMapper {
    /*int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);*/

    User selectByPrimaryKey(UserKey key);

    int countByUserCode(String usercode);

    String selectPassword(String username);
    int selectCompanyIdByUserCode(String userCode);
    UserVo selectAllByUserCode(String userCode);
}