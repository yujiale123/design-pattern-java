package com.yjl.design.structural.bridging;

/**
 * @Author yujiale
 * @Date 2022/6/28 20:21
 * @Description TODO
 **/
public class NormalNotification extends Notification {

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String messages) {

    }
}
