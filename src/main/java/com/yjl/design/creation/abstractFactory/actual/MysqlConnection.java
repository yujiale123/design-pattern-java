package com.yjl.design.creation.abstractFactory.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 20:25
 * @Description TODO
 **/
public class MysqlConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("mysql connection...");
    }
}
