package com.yjl.design.creation.builder.actualcombat.demo;


import org.apache.commons.lang3.StringUtils;

/**
 * @author yujiale
 */
public class ResourcePoolConfigBuilder {

    private static final int DEFAULT_MAX_TOTAL = 8;

    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    public String name;
    public int maxTotal = DEFAULT_MAX_TOTAL;

    public int maxIdle = DEFAULT_MAX_IDLE;

    public int minIdle = DEFAULT_MIN_IDLE;


    public ResourcePoolConfig build() {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("....");
        }

        if (maxIdle > maxTotal) {
            throw new IllegalArgumentException("....");

        }

        if (minIdle > maxTotal || minIdle > maxIdle) {
            throw new IllegalArgumentException("....");
        }

        return new ResourcePoolConfig(this);
    }

    public ResourcePoolConfigBuilder setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        this.name = name;
        return this;
    }
    public ResourcePoolConfigBuilder setMaxTotal(int maxTotal) {
        if (maxTotal < 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxTotal = maxTotal;
        return this;
    }

    public ResourcePoolConfigBuilder setMaxIdle(int maxIdle) {
        if (maxIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxIdle = maxIdle;
        return this;
    }




    public ResourcePoolConfigBuilder setMinIdle(int minIdle) {
        if (minIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.minIdle = minIdle;
        return this;
    }

}
