package com.upgrad.designpatterns.structural.frontcontroller.bad;

public class AdminViewHandler {
    private AdminView adminView;

    public AdminViewHandler() {
        this.adminView = new AdminView();
    }

    public void dispatch(){
        adminView.show();
    }
}
