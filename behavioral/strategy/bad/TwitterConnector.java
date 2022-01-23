package com.upgrad.designpatterns.behavioral.strategy.bad;

public class TwitterConnector implements Connector{
    String user;

    public TwitterConnector(String user) {
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
