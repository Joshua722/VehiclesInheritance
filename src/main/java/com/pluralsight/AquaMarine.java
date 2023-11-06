package com.pluralsight;

public class AquaMarine extends Vehicle {
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
