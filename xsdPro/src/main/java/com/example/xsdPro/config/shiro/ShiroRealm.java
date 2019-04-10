//package com.example.xsdPro.config.shiro;
//
//import com.example.xsdPro.model.*;
//import com.example.xsdPro.model.vo.UserVo;
//import com.example.xsdPro.service.impl.*;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ShiroRealm extends AuthorizingRealm {
//    @Autowired
//    private UserServiceImpl userServiceImpl;
//    @Autowired
//    private RoleServiceImpl roleServiceImpl;
//    @Autowired
//    private RoleRightServiceImpl roleRightServiceImpl;
//    @Autowired
//    private ModuleServiceImpl moduleServiceImpl;
//    @Autowired
//    private RolePersonServiceImpl rolePersonServiceImpl;
//    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);
//    /**
//     * 登录认证
//     * @param authenticationToken
//     * @return
//     * @throws AuthenticationException
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        logger.info("验证当前Subject时获取到token为：" + token.toString());
//        //查出是否有此用户
//        String userCode = token.getUsername();
//        UserVo hasUser=userServiceImpl.selectAllByUserCode(userCode);
////        UUser hasUser = uUserDao.selectAllByName(username);
//
//        if (hasUser != null) {
//            // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            //            List<URole> rlist = uRoleDao.findRoleByUid(hasUser.getId());//获取用户角色
//            List<RolePerson> rlist=rolePersonServiceImpl.findRolePersonByUserCode(userCode);//获取用户角色
//
////            List<UPermission> plist = uPermissionDao.findPermissionByUid(hasUser.getId());//获取用户权限
//            List<String> roleStrlist=new ArrayList<String>();////用户的角色集合
//            List<String> perminsStrlist=new ArrayList<String>();//用户的权限集合
//            for (RolePerson rolePerson : rlist) {
//              int roleId = rolePerson.getRoleId();
//              //通过角色ID 去角色表查角色名称
//               Role role= roleServiceImpl.findAllByRoleId(roleId);
//                roleStrlist.add(role.getRoleName());
//                //通过角色ID查出角色权限
//             List<RoleRight> roleRight= roleRightServiceImpl.findAllByRoleId(roleId);
//                for (RoleRight roleRight1:roleRight) {
//                    Integer moduleId = roleRight1.getModuleId();
//                //通过权限ID查权限名称
//                  Module module= moduleServiceImpl.findAllByModuleId(moduleId);
//                    String module1 = module.getModuleName();
//                    perminsStrlist.add(module1);
//                    System.out.println(userCode+"用户有模块"+module1+"权限");
//                }
//            }
////            for (UPermission uPermission : plist) {
////                perminsStrlist.add(uPermission.getName());
////            }
//
//            hasUser.setRoleStrlist(roleStrlist);
//            hasUser.setPerminsStrlist(perminsStrlist);
//            // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            return new SimpleAuthenticationInfo(hasUser, hasUser.getUserPass(), getName());
//        }
//
//        return null;
//    }
//
//
//    /**
//     * 权限认证
//     * @param principalCollection
//     * @return
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        logger.info("##################执行Shiro权限认证##################");
//        UserVo user = (UserVo) principalCollection.getPrimaryPrincipal();
//        if (user != null) {
//            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
//            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//            //用户的角色集合
//            info.addRoles(user.getRoleStrlist());
//            //用户的权限集合
//            info.addStringPermissions(user.getPerminsStrlist());
//
//            return info;
//        }
//        // 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
//        return null;
//    }
//}
