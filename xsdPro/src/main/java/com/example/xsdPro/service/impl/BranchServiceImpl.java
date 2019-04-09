package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.BranchMapper;
import com.example.xsdPro.model.Branch;
import com.example.xsdPro.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchServiceImpl implements IBranchService {
    @Autowired
    private BranchMapper branchMapper;
    public BranchMapper getBranchMapper() {
        return branchMapper;
    }

    public void setBranchMapper(BranchMapper branchMapper) {
        this.branchMapper = branchMapper;
    }

    @Override
    public int insert(Branch record) {
        return branchMapper.insert(record);
    }

    @Override
    public int getMaxBranchId() {
        return branchMapper.getMaxBranchId();
    }

    @Override
    public int deleteByPrimaryKey(Integer companyId, Integer branchId) {
        return branchMapper.deleteByPrimaryKey(companyId,branchId);
    }

    @Override
    public int updateByCompanyIdSelective(Branch record) {
        return branchMapper.updateByCompanyIdSelective(record);
    }

    @Override
    public List<Branch> selectByCompanyId(Integer companyId) {
        return branchMapper.selectByCompanyId(companyId);
    }

    @Override
    public List<Branch> selectBySupserBranchId(Integer companyId, Integer supserBranchId) {
        return branchMapper.selectBySupserBranchId(companyId,supserBranchId);
    }

    @Override
    public Branch selectByBranchId(Integer companyId, Integer branchId) {
        return branchMapper.selectByBranchId(companyId,branchId);
    }
}
