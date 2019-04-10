package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.RolePersonMapper;
import com.example.xsdPro.model.vo.RolePersonVo;
import com.example.xsdPro.service.RolePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolePersonServiceImpl implements RolePersonService {
    @Autowired
    private RolePersonMapper rolePersonMapper;
    @Override
    public List<RolePersonVo> findRolePersonByUserCode(String userCode) {
        return rolePersonMapper.findRolePersonByUserCode(userCode);
    }
}
