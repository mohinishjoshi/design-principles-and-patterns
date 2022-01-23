package com.upgrad.designpatterns.behavioral.strategy.good;

public class FacebookStrategy implements Strategy {
    String user;

    public FacebookStrategy(String user) {
        this.user = user;
    }

    @Override
    public void getPosts() {
        System.out.println("Facebook Posts for: " + user);
        System.out.println("FB Post 1");
        System.out.println("FB Post 2");
    }

    @Override
    public void post(String msg) {
        System.out.println("Post to Facebook");
        System.out.println(msg);
    }
}
