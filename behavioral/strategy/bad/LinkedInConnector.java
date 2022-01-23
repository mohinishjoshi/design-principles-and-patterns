package com.upgrad.designpatterns.behavioral.strategy.bad;

public class LinkedInConnector implements Connector{
    String user;

    public LinkedInConnector(String user) {
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
