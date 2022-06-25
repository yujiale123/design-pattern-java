package com.yjl.design.creation.builder.actualcombat.demo;

/**
 * @author yujiale
 */
public class MainTest {
    public static void main(String[] args) {


        ResourcePoolConfig poolConfig = new ResourcePoolConfigBuilder().setName("db-connection-pool").setMaxTotal(16).setMaxIdle(10).setMinIdle(12).build();

        System.out.println(poolConfig);
    }
}
