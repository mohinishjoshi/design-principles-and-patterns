package com.upgrad.designpatterns.behavioral.strategy.good;

public class LinkedInStrategy implements Strategy {
    String user;

    public LinkedInStrategy(String user) {
        this.user = user;
    }

    @Override
    public void getPosts() {
        System.out.println("LinkedIn Posts for: " + user);
        System.out.println("LinkedIn Post 1");
        System.out.println("LinkedIn Post 2");
    }

    @Override
    public void post(String msg) {
        System.out.println("Post to LinkedIn");
        System.out.println(msg);
    }
}
