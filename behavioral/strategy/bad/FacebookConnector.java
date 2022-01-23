package com.upgrad.designpatterns.behavioral.strategy.bad;

public class FacebookConnector implements Connector{
    String user;

    public FacebookConnector(String user) {
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
