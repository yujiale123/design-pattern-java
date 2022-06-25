package com.yjl.design.creation.builder.actualcombat.practice;

/**
 * @author yujiale
 */
public class ConstructorArg {


    private boolean isRef;
    private Class type;

    private Object arg;

    public ConstructorArg(ConstructorArgArgBuilder builder){
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }


    public Boolean getIsRef(){
        return isRef;
    }

    public Class getType(){
        return type;
    }

    public Object getArg() {
        return arg;
    }


}
