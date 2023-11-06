package com.pluralsight;

public class AquaMarine extends Vehicle {
    public AquaMarine(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isPublic, boolean isAbove, boolean isBelow) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, isPublic);
        this.isAbove = isAbove;
        this.isBelow = isBelow;
    }

    public AquaMarine (){
        super();
    }
    private boolean isAbove;
    private boolean isBelow;

    public boolean isAbove() {
        return isAbove;
    }

    public void setAbove(boolean above) {
        isAbove = above;
    }

    public boolean isBelow() {
        return isBelow;
    }

    public void setBelow(boolean below) {
        isBelow = below;
    }
}
