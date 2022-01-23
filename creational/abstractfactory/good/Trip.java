package com.upgrad.designpatterns.creational.abstractfactory.good;

public class Trip {
    private Cab cab;
    private Driver driver;

    public Trip(Cab cab, Driver driver) {
        this.cab = cab;
        this.driver = driver;
    }

    public void startTrip(){
        System.out.println("Starting the Trip");
    }

    public void endTrip(){
        System.out.println("Ending the Trip");
        System.out.println("Thank you for Using our Taxi Service");
    }
}
