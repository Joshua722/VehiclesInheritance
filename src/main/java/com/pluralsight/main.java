package com.pluralsight;

public class main {
    public static void main(String[] args) {
        Aerial helicopter = new Aerial();
        helicopter.setHoverType(true);
        helicopter.setPublic(true);
        AquaMarine submarine = new AquaMarine();
        submarine.setBelow(true);
    }
}
