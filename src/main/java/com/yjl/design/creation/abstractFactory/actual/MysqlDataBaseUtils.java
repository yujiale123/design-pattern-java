package com.yjl.design.creation.abstractFactory.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 20:26
 * @Description TODO
 **/
public class MysqlDataBaseUtils implements IDatabaseUtils{

    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}