package com.yjl.design.creation.builder.actualcombat.practice;

/**
 * @author yujiale
 */
public class ConstructorArgArgBuilder {

    public Boolean isRef;
    public Class type;
    public Object arg;

    public ConstructorArg build() {
        if (this.isRef) {
            if (this.arg instanceof String) {
                type = String.class;
            } else {
                throw new IllegalArgumentException("1");
            }
        } else {
            if (arg == null || type == null) {
                throw new IllegalArgumentException("2");
            }
        }

        return new ConstructorArg(this);
    }


    public ConstructorArgArgBuilder setIsRef(Boolean isRef) {
        this.isRef = isRef;
        return this;
    }

    public ConstructorArgArgBuilder setType(Class type) {
        this.type = type;
        return this;
    }

    public ConstructorArgArgBuilder setArg(Object arg) {
        this.arg = arg;

        return this;
    }
}
