package com.pluralsight;

public class Land extends Vehicle{
    public Land(){
        super();
    }

    public Land(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isPublic, boolean hasHitch, int wheelCount) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, isPublic);
        this.hasHitch = hasHitch;
        this.wheelCount = wheelCount;
    }

    private boolean hasHitch;
    private int wheelCount;

}
