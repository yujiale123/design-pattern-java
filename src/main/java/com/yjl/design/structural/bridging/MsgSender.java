package com.yjl.design.structural.bridging;

/**
 * @Author yujiale
 * @Date 2022/6/28 20:13
 * @Description TODO
 **/
public interface MsgSender {
    /**
     * 通用接口发送消息
     * @param message
     */
    void sendMsg(String message);
}
