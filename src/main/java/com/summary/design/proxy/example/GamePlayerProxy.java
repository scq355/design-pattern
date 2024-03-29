package com.summary.design.proxy.example;

public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // TODO 异常处理
        }
    }
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
