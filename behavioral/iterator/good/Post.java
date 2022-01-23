package com.upgrad.designpatterns.behavioral.iterator.good;

public class Post {
    private String message;
    private String username;

    public Post(String message, String username) {
        this.message = message;
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Post{" +
                "message='" + message + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
