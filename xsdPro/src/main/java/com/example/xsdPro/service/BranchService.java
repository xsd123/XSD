package com.example.xsdPro.service;

import com.example.xsdPro.model.Branch;

import java.util.List;

public interface BranchService {

    int insert(Branch record);

    int getMaxBranchId();

    int deleteByPrimaryKey(Integer companyId,Integer branchId);

    int updateByCompanyIdSelective(Branch record);

    List<Branch> selectByCompanyId(Integer companyId);

    List<Branch> selectBySupserBranchId(Integer companyId,Integer supserBranchId);

    Branch selectByBranchId(Integer companyId,Integer branchId);
}
