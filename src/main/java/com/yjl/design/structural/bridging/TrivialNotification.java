package com.yjl.design.structural.bridging;

/**
 * @Author yujiale
 * @Date 2022/6/28 20:28
 * @Description TODO
 **/
public class TrivialNotification extends Notification {
    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String messages) {

    }
}
