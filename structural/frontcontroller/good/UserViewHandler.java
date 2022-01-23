package com.upgrad.designpatterns.structural.frontcontroller.good;

public class UserViewHandler {
    private UserView userView;

    public UserViewHandler() {
        this.userView = new UserView();
    }

    public void dispatch(){
        userView.show();
    }
}
