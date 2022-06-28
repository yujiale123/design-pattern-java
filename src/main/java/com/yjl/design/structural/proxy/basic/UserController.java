package com.yjl.design.structural.proxy.basic;

/**
 * @Author yujiale
 * @Date 2022/6/28 14:37
 * @Description TODO
 **/
public class UserController  implements IUserController
{
    @Override
    public UserVo login(String phone, String password) {
        UserVo userVo = new UserVo();
        userVo.setPhone(phone);
        userVo.setPassword(password);
        return userVo;
    }

    @Override
    public UserVo register(String phone, String password) {
        UserVo userVo = new UserVo();
        userVo.setPhone(phone);
        userVo.setPassword(password);
        return userVo;
    }
}
