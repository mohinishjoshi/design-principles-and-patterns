package com.upgrad.designpatterns.behavioral.strategy.bad;

public class Demo {
    public static void main(String[] args) {
        Connector facebook = new FacebookConnector("John");
        Connector linkedin = new LinkedInConnector("Ruby");


        facebook.getPosts();


        linkedin.post("This is a Professional Course.");
    }
}
