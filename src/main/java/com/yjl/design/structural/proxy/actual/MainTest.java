package com.yjl.design.structural.proxy.actual;

import com.yjl.design.structural.proxy.basic.IUserController;
import com.yjl.design.structural.proxy.basic.UserControllerProxy;
import com.yjl.design.structural.proxy.basic.UserVo;

/**
 * @Author yujiale
 * @Date 2022/6/28 18:47
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserControllerProxy());
        UserVo login = userController.login("123123", "123123");


    }
}
