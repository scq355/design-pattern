package com.summary.design.proxy.force;

public class Client {

    public static void main(String[] args) {
        directInvoke();
        directProxy();
        forceProxy();
    }

    private static void directInvoke() {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是：2022-8-25 10:45");
        player.login("zhangSan", "password");
        // 开始杀怪
        player.killBoss();
        // 升级
        player.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：2022-8-26 03:40");
    }

    private static void directProxy() {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }

    private static void forceProxy() {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        //获得指定的代理
        IGamePlayer proxy = player.getProxy();
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
