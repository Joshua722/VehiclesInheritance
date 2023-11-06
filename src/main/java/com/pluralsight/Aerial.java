package com.pluralsight;

public class Aerial extends Vehicle {
    private boolean isHoverType = false;
    private boolean isFlyType = false;
    private boolean isHybridType = false;


    public boolean isHoverType() {
        return isHoverType;
    }

    public void setHoverType(boolean hoverType) {
        isHoverType = hoverType;
    }

    public boolean isFlyType() {
        return isFlyType;
    }

    public void setFlyType(boolean flyType) {
        isFlyType = flyType;
    }

    public boolean isHybridType() {
        return isHybridType;
    }

    public void setHybridType(boolean hybridType) {
        isHybridType = hybridType;
    }
}
