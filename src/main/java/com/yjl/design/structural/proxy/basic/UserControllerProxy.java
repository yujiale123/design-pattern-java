package com.yjl.design.structural.proxy.basic;

/**
 * @Author yujiale
 * @Date 2022/6/28 14:46
 * @Description TODO
 **/
public class UserControllerProxy extends UserController {

    private UserController userController;

    public UserControllerProxy() {
    }

    public UserControllerProxy(UserController userController) {

        this.userController = userController;
    }

    @Override
    public UserVo login(String phone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo login = userController.login(phone, password);
        long endTimestamp = System.currentTimeMillis();
        long responseTime = endTimestamp - startTimestamp;
        return login;
    }

    @Override
    public UserVo register(String phone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo register = userController.register(phone, password);
        long endTimestamp = System.currentTimeMillis();
        long responseTime = endTimestamp - startTimestamp;
        return register;
    }
}
