package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.RoleMapper;
import com.example.xsdPro.model.Role;
import com.example.xsdPro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role findAllByRoleId(int roleId) {
        return roleMapper.findAllByRoleId(roleId);
    }
}
