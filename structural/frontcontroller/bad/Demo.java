package com.upgrad.designpatterns.structural.frontcontroller.bad;

public class Demo {
    public static void main(String[] args) {
        String request = "ADMIN";

        switch (request.toLowerCase()){
            case "admin":
                AdminViewHandler adminViewHandler = new AdminViewHandler();
                adminViewHandler.dispatch();
                break;
            case "user":
                UserViewHandler userViewHandler = new UserViewHandler();
                userViewHandler.dispatch();
                break;
            default:
                GuestViewHandler guestViewHandler = new GuestViewHandler();
                guestViewHandler.dispatch();
        }
    }
}
