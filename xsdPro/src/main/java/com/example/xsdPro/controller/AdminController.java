package com.example.xsdPro.controller;

import com.example.xsdPro.model.User;
import com.example.xsdPro.model.UserKey;
import com.example.xsdPro.model.vo.RolePersonVo;
import com.example.xsdPro.service.impl.*;
import com.example.xsdPro.utils.RedisService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class AdminController {
    @Autowired
    private CompanyServiceImpl companyServiceImpl;
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private ModuleServiceImpl moduleServiceImpl;
    @Autowired
    private RolePersonServiceImpl rolePersonServiceImpl;
    @Autowired
    private PersonServiceImpl personServiceImpl;
    @Autowired
    private RoleRightServiceImpl roleRightServiceImpl;

    @Autowired
    private RedisService redisService;
   // private static Logger logger = (Logger) LoggerFactory.getLogger(AdminController.class);
   Log logger = LogFactory.getLog(this.getClass());
    //跳转到登录表单页面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "index";
    }

    //登录成功后，跳转的页面
    @RequestMapping("/success")
    public String index(Model model) {
        return "success";
    }

    //未登录，可以访问的页面
    @RequestMapping("/index")
    public String list(Model model) {
        return "index";
    }

//登陆验证，这里方便url测试，正式上线需要使用POST方式提交
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public ModelAndView  index(String companyCode, String userCode,
                String userPass, HttpServletRequest request, HttpSession session){
            ModelAndView mav = new ModelAndView();

            String msg;
            //根据集团代码查集团id
            Integer a = companyServiceImpl.selectCompanyCode(companyCode);
            User user = userServiceImpl.selectByPrimaryKey(new UserKey(a, userCode));
            if (user != null) {
                logger.info("对用户[" + userCode + "]进行登录验证..验证开始");
                if (user.getUserPass().equals(userPass)) {
                    try {
                        logger.info("用户[" + userCode + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                        System.out.println("用户[" + userCode + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                        redisService.set("user", user);
                        List<RolePersonVo> rolePersons = rolePersonServiceImpl.findRolePersonByUserCode(userCode);
                        redisService.set("rolePersons", rolePersons);
                        redisService.set("person", personServiceImpl.findALLByPersonId(user.getPersonId()));
                        for (RolePersonVo rp : rolePersons) {
                            rp.setRoleRight(roleRightServiceImpl.findAllByRoleId(rp.getRoleId()));
                        }
                        redisService.set("rolePersons", rolePersons);
                        mav.setViewName("success");
                        return mav;
                    } catch (Exception e) {
                        e.printStackTrace();
                        msg="账号密码不匹配";
                       // map.put("msg",msg);
                        session.setAttribute("errormsg", "账号或密码错误!请重新输入");
                    }
                }

            } else {
                logger.info("用户[" + userCode + "]集团代码和用户ID不匹配");
                System.out.println("用户[" + userCode + "]集团代码和用户ID不匹配");
                session.setAttribute("errormsg", "集团代码和用户ID不匹配!请重新输入");
                mav.setViewName("index");
                return mav;
            }
        mav.setViewName("index");
        return mav;
    }
//    /**
//     * ajax登录请求接口方式登陆
//     * @param username
//     * @param password
//     * @return
//     */
//    @RequestMapping(value="/ajaxLogin",method= RequestMethod.POST)
//    @ResponseBody
//    public Map<String,Object> submitLogin(@RequestParam(value = "nickname") String username, @RequestParam(value = "pswd") String password) {
//        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
//        try {
//
//            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//            SecurityUtils.getSubject().login(token);
//            resultMap.put("status", 200);
//            resultMap.put("message", "登录成功");
//
//        } catch (Exception e) {
//            resultMap.put("status", 500);
//            resultMap.put("message", e.getMessage());
//        }
//        return resultMap;
//    }

//    //登出
//    @RequestMapping(value = "/logout")
//    public String logout(){
//        return "logout";
//    }
//
//    //错误页面展示
//    @GetMapping("/403")
//    public String error(){
//        return "error ok!";
//    }
//
//    //管理员功能
//    @RequiresRoles("admin")
//    @RequiresPermissions("管理员添加")
//    @RequestMapping(value = "/admin/add")
//    public String create(){
//        return "add success!";
//    }
//
//    //用户功能
//    @RequiresRoles("user")
//    @RequiresPermissions("用户查询")
//    @RequestMapping(value = "/user/select")
//    public String detail(){
//        return "select success";
//    }

}
