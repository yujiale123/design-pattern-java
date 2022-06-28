package com.yjl.design.structural.bridging;

/**
 * @Author yujiale
 * @Date 2022/6/28 20:20
 * @Description TODO
 **/

public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String messages) {

    }
}
