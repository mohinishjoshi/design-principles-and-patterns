package com.upgrad.designpatterns.structural.frontcontroller.good;

public class Dispatcher {
    private UserView userView;
    private AdminView adminView;
    private GuestView guestView;

    public Dispatcher(){
        adminView = new AdminView();
        userView = new UserView();
        guestView = new GuestView();
    }

    public void dispatch(String request){

        switch (request.toLowerCase()){
            case "admin":
                adminView.show();
                break;
            case "user":
                userView.show();
                break;
            default:
                guestView.show();
        }
    }
}
