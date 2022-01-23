package com.upgrad.designpatterns.structural.frontcontroller.good;

public class AdminViewHandler {
    private AdminView adminView;

    public AdminViewHandler() {
        this.adminView = new AdminView();
    }

    public void dispatch(){
        adminView.show();
    }
}
