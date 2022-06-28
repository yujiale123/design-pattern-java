package com.yjl.design.structural.bridging;

/**
 * @Author yujiale
 * @Date 2022/6/28 20:20
 * @Description TODO
 **/
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String messages) {

    }
}
