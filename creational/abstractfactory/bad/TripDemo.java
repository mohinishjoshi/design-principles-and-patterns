package com.upgrad.designpatterns.creational.abstractfactory.bad;

public class TripDemo {
    public static void main(String[] args) {

        Trip trip = new Trip(new MiniCab(), new MiniDriver());

        System.out.println("Mini Cab");
        trip.startTrip();
        trip.endTrip();

        trip = new Trip(new SedanPlayCab(), new MiniDriver());

        System.out.println("Mini Cab");
        trip.startTrip();
        trip.endTrip();
    }
}
