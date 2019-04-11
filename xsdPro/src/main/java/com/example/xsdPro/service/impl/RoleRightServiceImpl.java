package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.RoleRightMapper;
import com.example.xsdPro.model.RoleRight;
import com.example.xsdPro.service.RoleRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleRightServiceImpl implements RoleRightService {
    @Autowired
    private RoleRightMapper roleRightMapper;
    @Override
    public List<RoleRight> findAllByRoleId(int roleId) {
        return roleRightMapper.findAllByRoleId(roleId);
    }
}
