package com.yjl.design.creation.prototype.actualcombat.sql;

import java.io.*;

/**
 * @Author yujiale
 * @Date 2022/6/26 15:18
 * @Description TODO
 **/
public class RealizeDeepCopyMethod02 {
    public Object deepCopy(Object object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(object);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

}
