package com.upgrad.designpatterns.behavioral.strategy.good;

public class TwitterStrategy implements Strategy {
    String user;

    public TwitterStrategy(String user) {
        this.user = user;
    }

    @Override
    public void getPosts() {
        System.out.println("Twitter Tweets for: " + user);
        System.out.println("Tweet 1");
        System.out.println("Tweet 2");
    }

    @Override
    public void post(String msg) {
        System.out.println("Post to Twitter");
        System.out.println(msg);
    }
}
