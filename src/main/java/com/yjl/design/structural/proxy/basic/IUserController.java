package com.yjl.design.structural.proxy.basic;

/**
 * @Author yujiale
 * @Date 2022/6/28 14:36
 * @Description TODO
 **/
public interface IUserController {
    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    UserVo  login(String phone, String password);

    /**
     * 注册
     * @param phone
     * @param password
     * @return
     */
    UserVo register(String phone, String password);
}
