package com.example.xsdPro.controller;

import com.example.xsdPro.model.Branch;
import com.example.xsdPro.model.Person;
import com.example.xsdPro.service.BranchService;
import com.example.xsdPro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService iBranchService;

    @Autowired
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public BranchService getiBranchService() {
        return iBranchService;
    }
    public void setiBranchService(BranchService iBranchService) {
        this.iBranchService = iBranchService;
    }

    @PostMapping("/getBranchInfo")
    @ResponseBody
    public Map<String, Object> getBranchInfo(Integer branchId, ModelAndView mv){
        Branch branch=iBranchService.selectByBranchId(1,branchId);
        Person person=personService.selectByPrimaryKey(1,branch.getBranchId(),branch.getHeadPersonId());
        mv.addObject("person",person);
        mv.addObject("branch",branch);
        return mv.getModel();
    }

    @PostMapping("/updateBranchInfo")
    @ResponseBody
    public Map<String, Object> updateBranchInfo(Branch bran, ModelAndView mv){
        bran.setCompanyId(1);
        bran.setInsPersonName("Testers");
        bran.setInsDate(new Date());
        if(bran.getSupserBranchId()==0){
            bran.setSupserBranchId(null);
        }
        if(bran.getBranchProperty()==1){
            bran.setBrandId(null);
        }
        int i=iBranchService.updateByCompanyIdSelective(bran);
        if (i>0){
            mv.addObject("Result","修改成功");
        }else{
            mv.addObject("Result","修改失败");
        }
        return mv.getModel();
    }

    @PostMapping("/delectBranchInfo")
    @ResponseBody
    public Map<String, Object> delectBranchInfo(Integer branchId,Integer supserBranchId, ModelAndView mv){
        if(iBranchService.selectBySupserBranchId(1,branchId).size()>0){
            mv.addObject("Result","此节点下面有子节点不能删除");
            return  mv.getModel();
        }
        int i=iBranchService.deleteByPrimaryKey(1,branchId);
        if(i>0){
            mv.addObject("Result","删除成功");
        }else{
            mv.addObject("Result","删除失败");
        }
        return mv.getModel();
    }

    @PostMapping("/insertBranch")
    @ResponseBody
    public Map<String, Object> insertBranch(Branch bran, ModelAndView mv){
        int branchid=iBranchService.getMaxBranchId();
        if (bran.getBranchId()!=null){
            bran.setSupserBranchId(bran.getBranchId());
        }
        branchid+=1;
        bran.setCompanyId(1);
        bran.setBranchId(branchid);
        bran.setInsPersonName("Testers");
        bran.setInsDate(new Date());
        if(bran.getBranchProperty()==1){
            bran.setBrandId(null);
        }
        if(bran.getSupserBranchId()==0){
            bran.setSupserBranchId(null);
        }
        int i=iBranchService.insert(bran);
        if (i>0){
            mv.addObject("Result","添加成功");
        }else{
            mv.addObject("Result","添加失败");
        }
        return mv.getModel();
    }
}
