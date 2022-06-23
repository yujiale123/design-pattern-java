package com.yjl.design.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 */
public class Mybatis {

    /**
     * 用户缓存
     */
    private Map<String, User> userCache = new HashMap<>();

    public User getUser(String name) throws CloneNotSupportedException {
        User user = null;
        if (!userCache.containsKey(name)) {
            user = getUserDb(name);
        } else {
            //直接从缓存中拿，可能会造成 脏缓存问题
            //原型已经拿到但是不能直接给(本人）
            user = userCache.get(name);
            System.out.println("从缓存中拿到的:" + user);
            //从这个对象快速得到一个克隆体   相当于原型模式
            user = (User) user.clone();
        }
        return user;

    }

    private User getUserDb(String name) throws CloneNotSupportedException {
        System.out.println("从数据库查找:" + name);
        User user = new User();
        user.setName(name);
        user.setAge(18);
        user.setAddress("湖北武汉");
        userCache.put(name, (User) user.clone());
        return user;
    }
}
