package com.yjl.design.creation.abstractFactory.actual;

/**
 * @author yujiale
 */
public interface IDatabaseUtils {
    IConnection getConnection();
    ICommand getCommand();
}
