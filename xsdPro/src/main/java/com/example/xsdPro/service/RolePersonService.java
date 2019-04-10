package com.example.xsdPro.service;

import com.example.xsdPro.model.vo.RolePersonVo;

import java.util.List;

public interface RolePersonService {
    List<RolePersonVo> findRolePersonByUserCode(String userCode);
}
