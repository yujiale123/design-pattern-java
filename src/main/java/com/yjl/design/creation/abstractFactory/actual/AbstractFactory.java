package com.yjl.design.creation.abstractFactory.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 20:22
 * @Description TODO
 * 工厂模式之抽象工厂
 *
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象
 * 优点
 * - 一个调用者想创建一个对象，只要知道其名称就可以了。
 * - 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 * - 屏蔽产品的具体实现，调用者只关心产品的接口。
 * 缺点
 * - 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 *
 **/
public class AbstractFactory {
    public static void main(String[] args) {
        IDatabaseUtils iDatabaseUtils = new OracleDataBaseUtils();
        IConnection connection = iDatabaseUtils.getConnection();
        connection.connect();
        ICommand command = iDatabaseUtils.getCommand();
        command.command();
    }
}


