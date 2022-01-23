package com.upgrad.designpatterns.behavioral.strategy.good;

public class Demo {
    public static void main(String[] args) {
        String user1 = "Adam";
        String user2 = "Sandra";
        SocialContext socialContext = new SocialContext();

        socialContext.setStrategy(new FacebookStrategy(user1));

        socialContext.getPosts();

        socialContext.post("Test Post to facebook.");

        System.out.println("===================================\n\n");

        socialContext.setStrategy(new LinkedInStrategy(user2));

        socialContext.getPosts();

        socialContext.post("Test Post to LinkedIn.");
    }
}
