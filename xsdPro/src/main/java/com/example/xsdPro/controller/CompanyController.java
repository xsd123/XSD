package com.example.xsdPro.controller;

import com.example.xsdPro.model.*;
import com.example.xsdPro.model.Vo.BranchVo;
import com.example.xsdPro.model.Vo.CompanyVo;
import com.example.xsdPro.service.*;
import com.example.xsdPro.utils.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService iCompanyService;

    @Autowired
    private BranchService iBranchService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private PersonService personService;

    @Autowired
    private RedisService redisService ;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public BrandService getBrandService() {
        return brandService;
    }

    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }
    public BranchService getiBranchService() {
        return iBranchService;
    }
    public void setiBranchService(BranchService iBranchService) {
        this.iBranchService = iBranchService;
    }
    public CompanyService getiCompanyService() {
        return iCompanyService;
    }

    public void setiCompanyService(CompanyService iCompanyService) {
        this.iCompanyService = iCompanyService;
    }

    @GetMapping("/info")
    public String selectByPrimaryKey(HttpServletRequest request){
        User user= (User) redisService.get("user");
        //根据id查询父级菜单
        Company com=iCompanyService.selectByPrimaryKey(user.getCompanyId());
        //查询对应的子级菜单
        List<Branch> branchList=iBranchService.selectByCompanyId(com.getId());//2级节点
        //2级节点list 每个list包含了所有他的下级的菜单
        List<BranchVo> branchVOList=new ArrayList<>();
        for (Branch branch :branchList){
            BranchVo vo=branchToVO(branch);
            //根据二级节点加公司编号查询下级菜单
            List<Branch> branchChildnodeList=iBranchService.selectBySupserBranchId(user.getCompanyId(),branch.getBranchId());//3级节点
            List<BranchVo> branchVOChildnodeList=new ArrayList<>();
            List<Person> personList=new ArrayList<>();
            for (Branch branch1 :branchChildnodeList){
                branchVOChildnodeList.add(branchToVO(branch1));
                List<Person> personlist=personService.selectByCompanyId(user.getCompanyId(),branch1.getBranchId());//4级节点
                for (Person person:personlist){
                    personList.add(person);
                }
            }
            vo.setPersonList(personList);
            vo.setList(branchVOChildnodeList);
            branchVOList.add(vo);
        }

        CompanyVo companyVO=entityToVO(com);
        companyVO.setBranchVOList(branchVOList);

        List<Brand> brandList=brandService.selectByCompanyId(com.getId());

        request.setAttribute("brandList",brandList);
        request.setAttribute("companyName",com.getCompanyName());
        request.setAttribute("companyVO",companyVO);
        return "company";
    }

    //这里是个转型
    private CompanyVo entityToVO(Company entity){
        CompanyVo vo=new CompanyVo();
        vo.setAddress(entity.getAddress());
        vo.setAdministratorName(entity.getAdministratorName());
        vo.setAdministratorPass(entity.getAdministratorPass());
        vo.setAuditor(entity.getAuditor());
        vo.setAuditorDate(entity.getAuditorDate());
        vo.setCity(entity.getCity());
        vo.setCloseDate(entity.getCloseDate());
        vo.setCloseMan(entity.getCloseMan());
        vo.setCompanyCode(entity.getCompanyCode());
        vo.setCompanyName(entity.getCompanyName());
        vo.setCompanyNameJ(entity.getCompanyNameJ());
        vo.setDateOpening(entity.getDateOpening());
        vo.setDistrict(entity.getDistrict());
        vo.seteMail(entity.geteMail());
        vo.setFax(entity.getFax());
        vo.setGrade(entity.getGrade());
        vo.setId(entity.getId());
        vo.setInsDate(entity.getInsDate());
        vo.setInsMan(entity.getInsMan());
        vo.setNature(entity.getNature());
        vo.setPost(entity.getPost());
        vo.setProvince(entity.getProvince());
        vo.setRemark(entity.getRemark());
        vo.setStatue(entity.getStatue());
        vo.setStopAmont(entity.getStopAmont());
        vo.setUpdateDate(entity.getUpdateDate());
        vo.setUpdateMan(entity.getUpdateMan());
        return vo;
    }

    //子节点表转型VO
    private BranchVo branchToVO(Branch entity){
        BranchVo vo=new BranchVo();
        vo.setBranchCode(entity.getBranchCode());
        vo.setBranchName(entity.getBranchName());
        vo.setBranchProperty(entity.getBranchProperty());
        vo.setBrandId(entity.getBrandId());
        vo.setHeadPersonId(entity.getHeadPersonId());
        vo.setInsDate(entity.getInsDate());
        vo.setInsPersonName(entity.getInsPersonName());
        vo.setRemark(entity.getRemark());
        vo.setSupserBranchId(entity.getBranchId());
        vo.setBranchId(entity.getBranchId());
        vo.setCompanyId(entity.getCompanyId());
        return vo;
    }
}
