package com.example.xsdPro.service;

import com.example.xsdPro.model.RoleRight;

import java.util.List;

public interface RoleRightService {
    List<RoleRight> findAllByRoleId(int roleId);
}
