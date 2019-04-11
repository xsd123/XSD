package com.example.xsdPro.service;

import com.example.xsdPro.model.User;
import com.example.xsdPro.model.UserKey;
import com.example.xsdPro.model.Vo.UserVo;


public interface UserService {
    boolean countByUserCode (String usercode);
    String selectPassword (String usercode);
    int selectCompanyIdByUserCode(String userCode);
    UserVo selectAllByUserCode(String userCode);
    User selectByPrimaryKey(UserKey userKey);
}
