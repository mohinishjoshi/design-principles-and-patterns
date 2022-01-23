package com.upgrad.designpatterns.behavioral.strategy.good;

public class SocialContext {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getPosts(){
        strategy.getPosts();
    }

    public void post(String msg){
        strategy.post(msg);
    }
}
