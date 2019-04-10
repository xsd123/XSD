package com.example.xsdPro.dao;

import com.example.xsdPro.model.Branch;
<<<<<<< HEAD
import com.example.xsdPro.model.BranchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BranchMapper {

    int insert(Branch record);

    int deleteByPrimaryKey(@Param("companyId")Integer companyId,@Param("branchId")Integer branchId);

    int updateByCompanyIdSelective(Branch record);

    int getMaxBranchId();
    List<Branch> selectByCompanyId(Integer companyId);

    List<Branch> selectBySupserBranchId(@Param("companyId")Integer companyId,@Param("supserBranchId")Integer supserBranchId);

    Branch selectByBranchId(@Param("companyId") Integer companyId, @Param("branchId")Integer branchId);
=======
import com.example.xsdPro.model.BranchKey;

public interface BranchMapper {
    int deleteByPrimaryKey(BranchKey key);

    int insert(Branch record);

    int insertSelective(Branch record);

    Branch selectByPrimaryKey(BranchKey key);

    int updateByPrimaryKeySelective(Branch record);
>>>>>>> liyi

}