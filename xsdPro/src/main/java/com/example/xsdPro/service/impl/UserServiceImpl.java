package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.UserMapper;
import com.example.xsdPro.model.User;
import com.example.xsdPro.model.UserKey;
import com.example.xsdPro.model.Vo.UserVo;
import com.example.xsdPro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    // 判断是否用户名是否存在
    @Override
    public boolean countByUserCode(String usercode) {
        if (userMapper.countByUserCode(usercode)!=0){
            return true;
        }
        return false;
    }

    // 根据用户返回查询的密码
    public String selectPassword(String username){
       return userMapper.selectPassword(username);
    }

    @Override
    public int selectCompanyIdByUserCode(String userCode) {
        return userMapper.selectCompanyIdByUserCode(userCode);
    }

    @Override
    public UserVo selectAllByUserCode(String userCode) {
        return userMapper.selectAllByUserCode(userCode);
    }

    @Override
    public User selectByPrimaryKey(UserKey userKey) {
        return userMapper.selectByPrimaryKey(userKey);
    }


}