package com.yjl.design.creation.abstractFactory.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 20:26
 * @Description TODO
 **/
public class OracleCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("oracle command...");
    }
}