package com.summary.design.proxy.example;

public class Client {

    public static void main(String[] args) {
        baseMode();
        proxyMode();
    }

    private static void baseMode() {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是：2022-8-25 10:45");
        player.login("zhangSan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：2022-8-26 03:40");
    }

    private static void proxyMode() {
        GamePlayerProxy proxy = new GamePlayerProxy("张三");
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
