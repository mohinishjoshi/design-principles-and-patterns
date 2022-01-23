package com.upgrad.designpatterns.creational.abstractfactory.good;

public abstract class TripFactory {
    public static TripFactory getTripFactory(TripType tripType) {
        if (tripType == TripType.MINI || tripType == TripType.MINI_MICRO) {
            return new MiniFactory(tripType);
        } else {
            return new SedanFactory(tripType);
        }
    }
    public abstract Trip getTrip();
    public abstract Driver getDriver();
    public abstract Cab getCab();
}
