package com.yjl.design.creation.builder.actualcombat.demo;

/**
 * @author yujiale
 */
public class ResourcePoolConfig {

    private String name;
    private int maxTotal;

    private int maxIdle;
    private int minIdle;

    public ResourcePoolConfig(ResourcePoolConfigBuilder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

}


